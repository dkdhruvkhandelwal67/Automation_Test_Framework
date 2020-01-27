package automation.testexeution.ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.common.Base;
import automation.ui.pages.Page_02;

public class Test_Page_02 extends Base{

	protected WebDriver driver;
	Page_02 obj2;

	@BeforeClass
	public void connect_drivers()
	{
		this.driver=Base.getdriver();
		obj2 = new Page_02(driver);
	}

	@Test
	public void presenceofallelementstest()
	{
		boolean status=false;
		status=obj2.checkpresenceofelements();
		//Assert.assertTrue(status, "Elements are not visible or loaded");
		}

	@Test
	public void clicknewlinktest()
	{
		obj2.clicktoopennewlink();
	}
}
