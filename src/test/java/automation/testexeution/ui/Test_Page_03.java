package automation.testexeution.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.common.Base;
import automation.ui.pages.Page_03;

public class Test_Page_03 extends Base{
	
	protected WebDriver driver;
	Page_03 obj3;

	@BeforeClass
	public void connect_drivers()
	{
		this.driver=Base.getdriver();
		obj3 = new Page_03(driver);
	}

	@Test
	public void closewindowtest()
	{
		obj3.windowclose();
	}
	
	@Test
	public void zoominouttest()
	{
		obj3.zoomInandzoomOut();
	}
	
	@DataProvider
	public void fetchdata()
	{
		
	}
	
}
