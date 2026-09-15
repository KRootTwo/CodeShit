import os
from playwright.sync_api import sync_playwright

url = "https://soadu.app.box.com/s/43i7dcbonfhumpkt6riahv6qoancdheq"
save_folder = os.path.abspath("./downloaded_box_files")
os.makedirs(save_folder, exist_ok=True)

with sync_playwright() as p:
    # args=['--no-sandbox'] ensures compatibility across Linux containers and WSL
    browser = p.chromium.launch(
        headless=True,
        args=["--no-sandbox", "--disable-setuid-sandbox"]
    )
    context = browser.new_context(accept_downloads=True)
    page = context.new_page()

    print("Opening Box link...")
    page.goto(url, wait_until="networkidle", timeout=60000)

    # Box often renders the download button inside a toolbar
    download_btn = page.locator('button[data-resin-target="download"]').or_(
        page.locator('button:has-text("Download")')
    )

    try:
        download_btn.first.wait_for(state="visible", timeout=15000)
        print("Initiating download...")
        with page.expect_download(timeout=60000) as download_info:
            download_btn.first.click()

        download = download_info.value
        target_file = os.path.join(save_folder, download.suggested_filename)
        download.save_as(target_file)
        print(f"Successfully downloaded to: {target_file}")
    except Exception as e:
        # Take a screenshot to see what Box actually rendered (e.g., login wall, empty, password)
        page.screenshot(path="box_debug.png")
        print(f"Download failed or button not found: {e}")
        print("Saved debug screenshot to 'box_debug.png'.")

    browser.close()