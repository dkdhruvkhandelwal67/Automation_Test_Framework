package automation.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.Base;

public class Page_03 extends Base {

	private WebDriver driver;
	

	public Page_03(WebDriver basedriver)
	{
		this.driver=basedriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='QU77pf']")
	WebElement clicktoclosewindow;

	public void windowclose()
	{
		clicktoclosewindow.click();
	}

	public void zoomInandzoomOut()
	{
		List<WebElement>zoominout= driver.findElements(By.xpath("//div[@class='q84rzf']"));
		zoominout.get(0).click();
		zoominout.get(0).click();
		zoominout.get(1).click();
		zoominout.get(1).click();
	}
	
}
