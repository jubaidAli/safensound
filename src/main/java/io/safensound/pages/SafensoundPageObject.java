package io.safensound.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SafensoundPageObject extends BasePageObject {
	
	protected String safensoundTitle = "Spacelabs SafeNSound"; //title of page

	public SafensoundPageObject(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	// verify title
	public void verifyTitle() {
		log.info("Verifying the page title");
		Assert.assertTrue(driver.getTitle().contains(safensoundTitle));
	}

}
