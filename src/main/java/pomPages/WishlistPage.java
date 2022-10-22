package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o']")
	private WebElement add;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement popup;
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void playButton() {
		playicon.click();
	}
	public void pauseButton() {
		pauseicon.click();
	}
	public void addToWishlist() {
		add.click();
	}
	
	public void popupClick() {
		popup.click();
	}

}
