package module;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class signUpForm {

		
	//Variable private
		
		@FindBy (xpath="//a[text()='Create new account']")
		private  WebElement Createnewaccount ;
		
		@FindBy (xpath="//input[@name='firstname']")
		private  WebElement firstName ;
		
		@FindBy (xpath="//input[@name='lastname']")
		private  WebElement lastName ;
		
		@FindBy (xpath="//input[@name='reg_email__']")
		private  WebElement MobileNumber ;
		
		@FindBy (xpath="//input[@name='reg_passwd__']")
		private  WebElement NewPaasword ;
		
		@FindBy (xpath="//select[@name='birthday_day']")
		private  WebElement birthDay ;
		
		@FindBy (xpath="//select[@name='birthday_month']")
		private  WebElement birthMonth ;
		
		@FindBy (xpath="//select[@name='birthday_year']")
		private  WebElement birthyear ;
		
		@FindBy (xpath="//label[text()='Female']")
		private  WebElement Female ;
		
		@FindBy (xpath="//label[text()='Male']")
		private  WebElement Male ;
		
		@FindBy (xpath="//label[text()='Custom']")
		private  WebElement Custom ;
		
		@FindBy (xpath="//input[@name='custom_gender']")
		private  WebElement Customgender ;
		
		@FindBy (xpath="//input[@id='password_step_input']")
		private  WebElement Password ;
	
		@FindBy (xpath="//button[text()='Sign Up'][1]")
		private  WebElement SignUp ;
		
		
		@FindBy (xpath="//select[@aria-label='Select your pronoun']")
		private  WebElement SelectYourPronoun ;
		
		
		
		
		//constructor public
		
	public signUpForm ( WebDriver driver) {
		//To find Element
	PageFactory.initElements(driver, this);
	}
				
				
	//methods
	
	public void ClickCreatenewaccount() {
		Createnewaccount.click();
	}

	public void sendFirstName() {
		firstName.sendKeys("rashmi");
			}
	public void sendLastName() {
		lastName.sendKeys("Dubey");
		}
	public void moileNumber() {
		MobileNumber.sendKeys("9028874904");
		}
	public void sendbirthDay() {
		Select s= new Select(birthDay);
		s.selectByIndex(2);
		}

	public void sendbirthMonth() {
		Select s= new Select(birthMonth);
		s.selectByIndex(3);
		}
	public void sendbirthYear () {
		Select s= new Select( birthyear);
		s.selectByIndex(2);
		}
	public void clickFemale () {
		Female.click();
		}

	public void clickmale () {
		Male.click();
		}	
	public void clickCustom () {
		Custom.click();
		}	
	public void Customgender () {
		Customgender.click();
		}	
	
	public void SendPassword () {
		Password.sendKeys("123456");
		}	
	
	
	public void ClickSelectYourPronoun () {
	Select s= new Select(SelectYourPronoun);
	s.selectByVisibleText( "Wish her a happy birthday!");
	
		}	
	public void ClickSignUp  () {
		SignUp .click();
		}	
	
	//////////
	
	


					}





