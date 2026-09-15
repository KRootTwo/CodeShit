import os
import requests
from playwright.sync_api import sync_playwright

url = "https://soadu.app.box.com/s/43i7dcbonfhumpkt6riahv6qoancdheq"
save_folder = os.path.abspath("./downloaded_box_files")
os.makedirs(save_folder, exist_ok=True)

download_url = None

def handle_response(response):
    global download_url
    # Intercept Box internal API calls containing file tokens or download links
    if "box.com" in response.url and ("download_url" in response.url or "/content" in response.url):
        download_url = response.url

with sync_playwright() as p:
    browser = p.chromium.launch(
        headless=True,
        args=["--no-sandbox", "--disable-setuid-sandbox"]
    )
    context = browser.new_context(
        accept_downloads=True,
        user_agent="Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
    )
    page = context.new_page()
    page.on("response", handle_response)

    print("Navigating to Box link...")
    page.goto(url, wait_until="networkidle", timeout=60000)

    # Print page title to verify access
    print(f"Page Title: {page.title()}")

    # Check if download is triggered automatically or via an embedded anchor tag
    pdf_links = page.eval_on_selector_all(
        "a[href]",
        "elements => elements.map(e => ({text: e.innerText, href: e.href}))"
    )
    
    print("\nLinks detected on page:")
    found_any = False
    for link in pdf_links:
        if "download" in link["href"].lower() or ".pdf" in link["href"].lower():
            print(f"- {link['text']}: {link['href']}")
            found_any = True

    if not found_any:
        print("No direct download links exposed in DOM.")

    # Check if any cookies/tokens were acquired
    cookies = context.cookies()
    session_cookies = {c['name']: c['value'] for c in cookies}

    browser.close()

# Test direct dl=1 request using the browser's cookies
print("\nAttempting direct download via session cookies...")
target_url = "https://soadu.app.box.com/s/43i7dcbonfhumpkt6riahv6qoancdheq?dl=1"
headers = {
    "User-Agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
}
res = requests.get(target_url, headers=headers, cookies=session_cookies, stream=True, allow_redirects=True)

if res.status_code == 200 and "application/pdf" in res.headers.get("Content-Type", "").lower():
    out_path = os.path.join(save_folder, "downloaded_file.pdf")
    with open(out_path, "wb") as f:
        for chunk in res.iter_content(chunk_size=8192):
            f.write(chunk)
    print(f"File successfully retrieved: {out_path}")
elif res.status_code == 200 and "zip" in res.headers.get("Content-Type", "").lower():
    out_path = os.path.join(save_folder, "downloaded_folder.zip")
    with open(out_path, "wb") as f:
        for chunk in res.iter_content(chunk_size=8192):
            f.write(chunk)
    print(f"Archive successfully retrieved: {out_path}")
else:
    print(f"Download returned status {res.status_code}, content-type: {res.headers.get('Content-Type')}")