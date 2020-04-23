package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.qaclickacademyPage;
import resources.base;

public class validateTitle extends base{
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitilaizeDriver();
		driver.get(prop.getProperty("Url1"));
	}
	@Test
	public void validateTitlename() {		
		qaclickacademyPage qa=new qaclickacademyPage(driver);
		if(qa.getPopupSize()>0) {
			qa.getPopup().click();
		}
	    Assert.assertEquals(qa.validateTitle().getText(), "FEATURED COURSES");
	}
	@AfterTest
	public void TearDown() {
		driver.close();
		driver=null;
	}
}
