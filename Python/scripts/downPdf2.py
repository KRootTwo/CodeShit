import os
import time
from playwright.sync_api import sync_playwright

url = "https://soadu.app.box.com/s/43i7dcbonfhumpkt6riahv6qoancdheq"
save_folder = os.path.abspath("./downloaded_box_files")
os.makedirs(save_folder, exist_ok=True)

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

    print("Opening Box link...")
    page.goto(url, wait_until="domcontentloaded", timeout=60000)
    
    # Give Box's frontend framework time to hydrate the file list
    page.wait_for_timeout(5000)

    # 1. Try to find and click the "Select All" checkbox in the header
    select_all = page.locator('input[type="checkbox"][aria-label*="Select all"]').or_(
        page.locator('.header-checkbox, [data-resin-target="selectall"]')
    )

    if select_all.count() > 0 and select_all.first.is_visible():
        print("Selecting all files...")
        select_all.first.click()
        page.wait_for_timeout(1000)
    else:
        # Fallback: click individual file row checkboxes
        checkboxes = page.locator('input[type="checkbox"]')
        if checkboxes.count() > 0:
            print(f"Found {checkboxes.count()} checkboxes, selecting the first...")
            checkboxes.first.click()
            page.wait_for_timeout(1000)

    # 2. Look for the Download button (now enabled in toolbar or action bar)
    download_btn = page.locator('button[aria-label*="Download"]').or_(
        page.locator('button[data-resin-target="download"]')
    ).or_(
        page.locator('button:has-text("Download")')
    )

    try:
        download_btn.first.wait_for(state="visible", timeout=10000)
        print("Clicking Download button...")
        with page.expect_download(timeout=120000) as download_info:
            download_btn.first.click()

        download = download_info.value
        target_file = os.path.join(save_folder, download.suggested_filename)
        download.save_as(target_file)
        print(f"Saved: {target_file}")
    except Exception as e:
        page.screenshot(path="box_debug_action.png")
        print(f"Error during download trigger: {e}")
        print("Saved updated screenshot to 'box_debug_action.png'.")

    browser.close()