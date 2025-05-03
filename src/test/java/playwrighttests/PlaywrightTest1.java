package playwrighttests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightTest1 
{
	public static void main(String[] args) 
	{
		// Launch browser using playwright code
        Playwright pw=Playwright.create();
        Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=browser.newContext();
        Page driver=context.newPage();
        // Navigate to the site using playwright code
        driver.navigate("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
        // Wait for iframe and switch to it using playwright code
        driver.frameLocator("#iframeResult").locator("input[name='fname']").fill("abdul");
        driver.frameLocator("#iframeResult").locator("#lname").fill("kalam");
        // Click the submit button using playwright code
        driver.frameLocator("#iframeResult").locator("//input[@value='Submit']").click();
        // Wait for a while to observe the result using playwright code
        driver.waitForTimeout(5000);
        //Close site
	}

}
