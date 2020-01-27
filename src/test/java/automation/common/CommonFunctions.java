package automation.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFunctions {

	static Properties properties;
	static int implicit_waittime =5;
	static WebDriver driver;

	public static String getdata(String key,String filepath)
	{
		String data = null;
		String current = System.getProperty("user.dir");
		System.out.println(current);
		try {
			properties = new Properties();
			FileInputStream file = new FileInputStream(current+filepath);
			properties.load(file);
			data=(String) properties.get(key);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return data;
	}


	public static void setdata(String key,String filepath,String Value)
	{
		String current = System.getProperty("user.dir");
		try {
			properties = new Properties();
			FileOutputStream  file = new FileOutputStream(current+filepath);
			properties.setProperty(key,Value);
			properties.store(file, null);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}

	public static  WebDriver setupbrowserdriver(String browser)
	{
		String current = System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", current+"\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", current+"\\Lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		return driver;
	}

	public static void openurl(String URL,WebDriver driverfortest)
	{
		driverfortest.manage().deleteAllCookies();
		driverfortest.get(URL);
	}

	public static String gettitle(WebDriver driverfortest)
	{
		String title;
		title=driverfortest.getTitle();
		return title;
	}

}
