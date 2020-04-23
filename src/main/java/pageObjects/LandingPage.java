package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	
	@FindBy(id="username")
	WebElement USERNAME;
	
	@FindBy(id="password")
	WebElement PASSWORD;
	
	@FindBy(className = "decorativeSubmit")
	WebElement Login;
	
	public WebElement getUsername() {
		return USERNAME;
	}
	
	public WebElement Password() {
		return PASSWORD;
	}
	
	public WebElement Signin() {
		return Login;
	}

	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
