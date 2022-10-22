package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	
	@FindBy(id="Cucumber")
	private WebElement cucumberarea;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class=\"fa fa-linkedin\"])[2]")
	private WebElement linkdin;

	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getCucumberarea() {
		return cucumberarea;
	}

	public WebElement getCartarea() {
		return cartarea;
	}
	
	public void linkdinbtn() {
		linkdin.click();
	}

}
