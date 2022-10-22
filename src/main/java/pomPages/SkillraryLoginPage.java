package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void cookies(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton() {
		gearsbtn.click();
	}
	
	public void skillraryDemoapp() {
		demoapp.click();
	}
	
	public void searchTextBox(String text) {
		searchtb.sendKeys(text);
	}
	
	public void searchButton() {
		searchbtn.click();
	}

}
