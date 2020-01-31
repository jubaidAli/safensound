import org.testng.annotations.Test;
import io.safensound.base.TestUtilities;
import io.safensound.pages.GooglePageObject;
import io.safensound.pages.SafensoundPageObject;

public class pageLinktest extends TestUtilities {

	
	/* Test the link exists */
	@Test
	public void SafensoundLinkTest() {
		log.info("Starting selectingTwoCheckboxesTest");

		// open main page
		GooglePageObject googlePage = new GooglePageObject(driver, log);
		googlePage.openPage();

		//Search for SafenSound 
		googlePage.search("spacelabs safensound");
		
		
		//find and click the safensound.io web page
		googlePage.clickLink();
		sleep(1000);
		
		
		//verify title page of safensound.io 
		SafensoundPageObject safensound = new SafensoundPageObject(driver, log);
		safensound.verifyTitle();
		
		
	}
}
