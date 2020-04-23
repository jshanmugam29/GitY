package stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Crmsfapage;
import pageObjects.LandingPage;
import resources.base;

public class stepDefinition extends base {

	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		driver = InitilaizeDriver();
	}

	@Given("^Navigate to site \"([^\"]*)\"$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@When("^I enter valid username as \"([^\"]*)\"$")
	public void i_enter_valid_username_as(String arg1) throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getUsername().sendKeys(arg1);
	}

	@When("^I enter valid password as \"([^\"]*)\"$")
	public void i_enter_valid_password_as(String arg1) throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.Password().sendKeys(arg1);
		lp.Signin().click();
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		Crmsfapage crm = new Crmsfapage(driver);
		Assert.assertTrue(crm.LabelDisplay().isDisplayed());
		System.out.println("Logged in successfully");
	}

}
