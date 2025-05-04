package playwrighttests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightTest2 
{
	public static void main(String[] args) throws Exception
	{
		//Open firefox browser
		try (Playwright playwright = Playwright.create()) {
            BrowserType firefox = playwright.firefox();
            Browser browser = firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.irctc.co.in");
            Thread.sleep(5000);
            System.out.println("IRCTC site launched in Firefox browser.");
        }
	}
}
