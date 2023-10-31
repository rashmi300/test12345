package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {
	
	//variable
	@FindBy (xpath=("//div[@class='x78zum5 x1n2onr6']") )
	private WebElement Navigate;

	@FindBy (xpath=("//span[text()='Log Out']"))
	
	//span[contains(text(),'Log Out')]
	private WebElement logout;

	private WebDriver driver;
	//constructor public
	public logoutpage  ( WebDriver driver) {
		//To find Element
		PageFactory.initElements(driver, this);
	}
	
	public void clickonLoginbutton() {
		Actions act = new Actions(driver);
	}
	
	//methods

	public void clickNavigate() {
		Navigate.click();
	}
	public void clicklogout() {
		logout.click();
		

}
}
