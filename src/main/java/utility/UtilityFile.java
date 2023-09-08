package utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class UtilityFile extends BaseClass{
	
	public void ClickOnWebElement(WebElement element, long waitTimeInSec) {
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSec));
		WebElement elements = null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
		
	}
	
	public void sendKeysWebElement(WebElement element, String text) {
		ClickOnWebElement(element, 5);
		element.clear();
		element.sendKeys(text);
		
	}
	
	public void mouseOverAndClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	

}
