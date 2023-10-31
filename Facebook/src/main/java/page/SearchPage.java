package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy (xpath="//input[@placeholder='Search Facebook']")
	private  WebElement Search ;	
	

	
	
	private WebDriver driver;
	//constructor public
	public SearchPage  ( WebDriver driver) {
		//To find Element
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	//methods

		public void ClickSearch() {
			Search.sendKeys("Sahil Arora");
		}	
	
}
