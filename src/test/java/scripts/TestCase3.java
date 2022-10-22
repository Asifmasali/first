package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchTextBox(pdata.getData("search"));
		s.searchButton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.coreJavaLink();
		
		WishlistPage w=new WishlistPage(driver);
		w.popupClick();
		driverutiles.switchFrame(driver);
		w.playButton();
		Thread.sleep(5000);
		w.pauseButton();
		driverutiles.switchBack(driver);
		w.addToWishlist();
	}

}
