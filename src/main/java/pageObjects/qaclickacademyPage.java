package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaclickacademyPage {
	WebDriver driver;

	By Title = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By popup = By.xpath("//button[contains(text(),'NO THANKS')]");

	public WebElement validateTitle() {
		return driver.findElement(Title);
	}

	public qaclickacademyPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPopup() {
		return driver.findElement(popup);
	}

	public int getPopupSize() {
		return driver.findElements(popup).size();
	}
}
