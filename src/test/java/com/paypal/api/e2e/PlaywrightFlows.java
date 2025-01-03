package com.paypal.api.e2e;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import io.github.cdimascio.dotenv.Dotenv;

public class PlaywrightFlows {
    private final Dotenv dotenv;
    private final String Email;
    private final String Password;
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    public PlaywrightFlows() {
        dotenv = Dotenv.load();
        Email = dotenv.get("EMAIL");
        Password = dotenv.get("PASSWORD");
    }

    private void initializeBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
        page = context.newPage();
    }

    private void closeBrowser() {
        context.close();
        playwright.close();
    }

    public boolean completePayment(String checkoutUrl) {
        try {
            initializeBrowser();
            page.navigate(checkoutUrl);
            if (Email != null && Password != null) {
                page.fill("#email", Email);
                if (page.isVisible("#btnNext")) {
                    page.click("#btnNext");
                }
                page.fill("#password", Password);
                page.click("#btnLogin");
                try {
                    // Check if successfully loaded the page
                    page.waitForSelector("#payment-submit-btn", new Page.WaitForSelectorOptions().setTimeout(15000));
                } catch (Exception e) {
                    // if the error page is shown then go to the previous page
                    page.goBack();
                    page.waitForSelector("#payment-submit-btn", new Page.WaitForSelectorOptions().setTimeout(15000));
                }
                page.waitForSelector("#payment-submit-btn", new Page.WaitForSelectorOptions().setTimeout(15000));
                page.click("#payment-submit-btn");
                try {
                    page.waitForURL("https://example.com/returnUrl**");
                } catch (Exception e) {
                    page.reload();
                    page.waitForURL("https://example.com/returnUrl**");
                }
                return true;
            } else {
                throw new Exception("EMAIL or PASSWORD environment variable is not set");
            }
        } catch (Exception e) {
            System.err.println("Error completing payment: " + e.getMessage());
            return false;
        } finally {
            closeBrowser();
        }
    }

    public boolean savePaymentMethod(String url) {
        try {
            initializeBrowser();
            page.navigate(url);
            if (Email != null && Password != null) {
                page.fill("#email", Email);
                if (page.isVisible("#btnNext")) {
                    page.click("#btnNext");
                }
                page.fill("#password", Password);
                page.click("#btnLogin");
                try {
                    if (page.locator("#consentButton").isVisible()) {
                        page.waitForSelector("#consentButton", new Page.WaitForSelectorOptions().setTimeout(15000));
                    } else {
                        page.locator("button:has-text(\"Continue\")")
                                .waitFor(new Locator.WaitForOptions().setTimeout(15000));
                        page.locator("button:has-text(\"Continue\")").click();
                        page.waitForSelector("#confirmButtonTop", new Page.WaitForSelectorOptions().setTimeout(15000));
                        page.click("#confirmButtonTop");
                    }
                } catch (Exception e) {
                    page.goBack();
                    if (page.locator("#consentButton").isVisible()) {
                        page.waitForSelector("#consentButton", new Page.WaitForSelectorOptions().setTimeout(15000));
                    } else {
                        page.locator("button:has-text(\"Continue\")")
                                .waitFor(new Locator.WaitForOptions().setTimeout(15000));
                        page.locator("button:has-text(\"Continue\")").click();
                        page.waitForSelector("#confirmButtonTop", new Page.WaitForSelectorOptions().setTimeout(15000));
                        page.click("#confirmButtonTop");
                    }
                }
                try {
                    page.waitForURL("https://example.com/returnUrl**");
                } catch (Exception e) {
                    page.reload();
                    page.waitForURL("https://example.com/returnUrl**");
                }

                return true;
            } else {
                throw new Exception("EMAIL or PASSWORD environment variable is not set");
            }
        } catch (Exception e) {
            System.out.println("Error saving payment method: " + e.getMessage());
            return false;
        } finally {
            closeBrowser();
        }
    }

    public boolean completeHeliosVerification(String checkoutUrl, boolean submitFormVerification) {
        try {
            initializeBrowser();
            page.navigate(checkoutUrl);
            page.waitForURL("https://www.sandbox.paypal.com/webapps/helios?action=verify&flow=3ds**");
            page.waitForLoadState(LoadState.NETWORKIDLE);

            if (submitFormVerification) {
                FrameLocator frame = page.frameLocator("iframe[name=\"threedsIframeV2\"]")
                        .frameLocator("iframe");

                Locator inputField = frame.locator("input[placeholder=\" Enter Code Here\"]");

                inputField.waitFor(new Locator.WaitForOptions().setTimeout(15000));

                Locator submitButton = frame.locator("input[type=\"submit\"][value=\"SUBMIT\"]");

                submitButton.waitFor(new Locator.WaitForOptions().setTimeout(15000));

                if (inputField.isVisible()) {
                    inputField.click();
                    inputField.fill("1234");
                }

                if (submitButton.isVisible()) {
                    submitButton.click();
                }
            }

            try {
                page.waitForURL("https://example.com/returnUrl**");
            } catch (Exception e) {
                page.reload();
                page.waitForURL("https://example.com/returnUrl**");
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error completing payment: " + e.getMessage());
            return false;
        } finally {
            closeBrowser();
        }
    }
}