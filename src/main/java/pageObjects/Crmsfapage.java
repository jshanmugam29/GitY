package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crmsfapage {
	
public WebDriver driver;

By Logo=By.cssSelector("#logo");
By link=By.xpath("//div[@for='crmsfa']/a");
By label=By.xpath("//h2[contains(text(),'Welcome')]");

public WebElement LabelDisplay() {
	return driver.findElement(label);
}

public void LogoDisplay() {
	System.out.println("Is Logo displayed: "+driver.findElement(Logo).isDisplayed());
}

public WebElement crmsfalin() {
	return driver.findElement(link);
}

public Crmsfapage(WebDriver driver) {
	this.driver=driver;
}
}
