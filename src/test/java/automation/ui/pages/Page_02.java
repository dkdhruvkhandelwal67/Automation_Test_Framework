package automation.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.Base;

public class Page_02 extends Base{
	private WebDriver driver;

	public Page_02(WebDriver basedriver)
	{
		this.driver=basedriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'INDUSTRIAL AUTOMATION SOLUTION')]")
	WebElement textlink;

	public boolean checkpresenceofelements()
	{
		boolean status = false;
		List<WebElement>Lst = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
		if(Lst.size()>0)
		{
			for (WebElement webElement : Lst) {

				status =webElement.isDisplayed();
			}
		}
		return status;
	}

	public void clicktoopennewlink()
	{
		textlink.click();
	}

}
