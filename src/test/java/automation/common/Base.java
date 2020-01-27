package automation.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base extends CommonFunctions{

	public static WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest(description = "Setting up driver for test")
	public void setbrowser(String browser)
	{
		Base.driver=CommonFunctions.setupbrowserdriver(browser);
	}

	public static WebDriver getdriver() {
		return driver;
	}

	public void setdriver(WebDriver newdriver) {
		this.driver = newdriver;
	}

		@AfterTest(description = "Closing browser")
		public void closebrowser()
		{
			driver.close();
		}
		
		

}