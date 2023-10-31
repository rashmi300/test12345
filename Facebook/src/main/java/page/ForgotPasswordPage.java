package page;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ForgotPasswordPage {
		//Variable private
				@FindBy (xpath="//a[text()='Forgotten password?']")
				private  WebElement forgotPassword ;
				
		@FindBy (xpath="//div[contains(text(),'Please enter your email address or mobile')] ")
				private  WebElement textmassage;
				
				@FindBy (xpath="//input[@id='identify_email'] ")
				private  WebElement emailAddressOrMobileNumber;
				
				@FindBy (xpath="//a[text()='Cancel'] ")
				private  WebElement cancleButton;
				
				@FindBy (xpath="//button[text()='Search'] ")
				private  WebElement searchButton;
				
				private WebDriver driver;
				//constructor public
				public ForgotPasswordPage ( WebDriver driver) {
					//To find Element
					PageFactory.initElements(driver, this);
					this.driver= driver;
				}
				
				
				//methods
				
				public void clickforgotPassword() {
					forgotPassword.click();
				}
				
				public void verifytextmassage() {
					textmassage.getText();
				}
				

				public void sendEmailid() {
					emailAddressOrMobileNumber.sendKeys("8862096906");
				}
				public void clickSearch() {
					searchButton.click();
				}
				public void clickClose() {
					searchButton.click();
				}
				
	}
	
	


