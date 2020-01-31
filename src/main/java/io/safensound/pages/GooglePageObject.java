package io.safensound.pages;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GooglePageObject extends BasePageObject {
	
	private String pageUrl = "http://google.com/";
	
	private By searchLocatorAddressBar = By.name("q"); //address bar
	private By googleSearchButton = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"); // search button 
	private String safensoundLink = "https://www.safensound.io/";	
	
	
	public GooglePageObject(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	/** Open googlePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public void search(String txt) {
		log.info("Searching googles address bar");
		click(searchLocatorAddressBar);
		log.info("Type text into address bar");
		type(txt,searchLocatorAddressBar);
		log.info("Clicking the google search button");
		click(googleSearchButton);
	}
	
	/** Open Safensound Page by clicking on address bar */
	public void clickLink() {
		log.info("Indexing through the google links");
		indexLinks(safensoundLink);
	}	
		
}
