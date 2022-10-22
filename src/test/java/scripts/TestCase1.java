package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilities;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutiles.switchTabs(driver);
	driverutiles.mouseHover(driver,sd.getCoursetab());
	sd.selenium();
	
	AddtocartPage ad=new AddtocartPage(driver);
	driverutiles.doubleClick(driver,ad.getAddbtn());
	ad.addtocartButton();
	driverutiles.alertpopup(driver);
	
	}
	

}
