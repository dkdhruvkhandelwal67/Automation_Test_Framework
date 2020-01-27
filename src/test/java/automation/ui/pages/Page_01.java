package automation.ui.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.Base;

public class Page_01 extends Base{
	private WebDriver driver;

	public Page_01(WebDriver basedriver)
	{
		this.driver=basedriver;
		PageFactory.initElements(driver, this);
	}

	public Page_01()
	{
	}

	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	WebElement inputbox;

	public void enterdatatosearch(String text)
	{
		inputbox.clear();
		inputbox.sendKeys(text);
		//		driver.findElement(By.xpath("//img[@alt='Google']")).click();
		try{
			Thread.sleep(3000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);}
		catch(Throwable e)
		{e.printStackTrace();}
		inputbox.sendKeys(Keys.ENTER);

	}

	public void clicktosearchbutton()
	{
		List<WebElement>lst = driver.findElements(By.xpath("//input[@value='Google Search']"));
//		lst.get(index)
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Google Search']")));
//
//		Actions builder = new Actions(driver);
//		builder.moveToElement(lst.get(1)).click().build().perform();
	}

}
