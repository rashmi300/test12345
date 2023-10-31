package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utlis.Utility;
import base.Browser;
import module.signUpForm;
import page.LoginOrSignUp;
import page.SearchPage;
import page.logoutpage;

public class VerifySignUPPage  extends Browser{
	private WebDriver driver;
	private LoginOrSignUp loginOrSignUp ;
	private signUpForm SignUpForm;
//	private SearchPage searchPage;
//	private ForgotPasswordPage  forgotPasswordPage;
	
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browsername){
		if(browsername.equals("Chrome"))
		{
	driver= lauchChrome();
		//Browser.lauchChrome();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@BeforeClass
	public void createPOMobject() {
		//loginOrSignUp = new LoginOrSignUp(driver);
		SignUpForm =new signUpForm (driver);
		//searchPage = new SearchPage(driver);
	//	forgotPasswordPage=new ForgotPasswordPage(driver);
		
	}
	
	@BeforeMethod
	public void openLoginPage() throws Throwable {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//String firstName=Utility.getDataFromExcelSheet("\"C:\\Users\\DELL\\Desktop\\Book1.xlsx\"", "Sheet1",2, 1);
	}
		
	@Test
	public void SignUpPage() {
		//signUpForm SignUpForm =new signUpForm (driver);
		SignUpForm.ClickCreatenewaccount();
		SignUpForm.sendFirstName();
		SignUpForm.sendLastName();
		SignUpForm.clickFemale();
		SignUpForm.moileNumber();
		SignUpForm.clickCustom();
		SignUpForm.Customgender();
		SignUpForm.sendbirthMonth();
		SignUpForm.sendbirthYear();
		SignUpForm.sendbirthDay();
		SignUpForm.ClickSignUp();
	
	}
	
	@AfterMethod
	public void Logout() {
		logoutpage Logoutpage= new logoutpage(driver);
		Logoutpage.clickNavigate();
		Logoutpage.clicklogout();
		
	}
	@AfterClass
	public void ClearObjet() {
		loginOrSignUp=null;
		//forgotPasswordPage=null;
		//searchPage=null;
	}
	

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		driver=null;
	}
	
	
	
	

}
