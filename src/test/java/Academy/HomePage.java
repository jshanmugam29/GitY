package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Crmsfapage;
import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException {
		driver = InitilaizeDriver();
		driver.get(prop.getProperty("url"));		
		LandingPage lp = new LandingPage(driver);
		lp.getUsername().sendKeys(Username);
		lp.Password().sendKeys(Password);
		System.out.println(text);
		lp.Signin().click();

		Crmsfapage crm = new Crmsfapage(driver);
		crm.LogoDisplay();
		crm.crmsfalin().click();
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "DemoSalesManager", "crmsfa", "User1" }, { "DemoSalesManager", "crmsfa", "User2" } };
	}

	@AfterTest
	public void TearDown() {
		driver.close();
		driver=null;
	}
}
