package page;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginOrSignUp {

		
			
			//Variable private
		
	
		
			@FindBy (xpath="//input[@name='email']")
			private  WebElement userName ;
			
			@FindBy (xpath="//input[@name='pass']")
			private  WebElement password ;

			@FindBy (xpath="//button[@name='login']")
			private  WebElement LoginButton ;
			
			@FindBy (xpath="//a[text()='Forgotten password?']")
			private  WebElement forgotPassword ;
			
			
			private WebDriver driver;
			
			//constructor public
			public LoginOrSignUp ( WebDriver driver) {
				//To find Element
				PageFactory.initElements(driver, this);
				this.driver=driver;
			}
			
			
			//methods
			
			
			
			public void sendUseName(String user) {
				userName.sendKeys(user);
			}
			public void sendPassword(String pass) {
				password.sendKeys(pass);
			}
			public void clickOnLoginButton() {
				Actions act = new Actions(driver);
				act.moveToElement(LoginButton).click().build().perform();
					
					
				
			}
			public void clickonforgetpassword() {
				forgotPassword.click();
			}


		}





