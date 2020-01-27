package automation.testexeution.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.common.Base;
import automation.common.CommonFunctions;
import automation.ui.pages.Page_01;

public class Test_Page_01 extends Base {
	protected WebDriver driver=null;
	Page_01 obj1;
	

	@BeforeClass
	public void connect_drivers()
	{
		this.driver=Base.getdriver();
		obj1 = new Page_01(driver);
	}
	
	@Test
	public void opentheurl()
	{
		Test_Page_01 objtest1 = new Test_Page_01();
		String URL;
		URL= CommonFunctions.getdata("base.url", "\\src\\test\\resources\\TestData.properties");
		CommonFunctions.openurl(URL, this.driver);
	}

	@Test
	public void searchtest()
	{
		obj1.enterdatatosearch("automation");
	}
	
	@Test
	public void searchbuttontest()
	{
		obj1.clicktosearchbutton();
	}
}
