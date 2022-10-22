package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLogin dl=new SkillraryDemoLogin(driver);
		driverutiles.switchTabs(driver);
		driverutiles.dropdown(dl.getCoursedd(),pdata.getData("coursedd"));
		
		CoursePage c=new CoursePage(driver);
		driverutiles.draganddrop(driver,c.getCucumberarea(),c.getCartarea());
		c.linkdinbtn();
		
	}

}
