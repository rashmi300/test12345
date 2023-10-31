package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;

import org.testng.annotations.Parameters;

import page.ForgotPasswordPage;
import page.LoginOrSignUp;
import page.SearchPage;
import page.logoutpage;

public class VerifySearchPage extends Browser{
	
		private WebDriver driver;
		private LoginOrSignUp loginOrSignUp ;
		private SearchPage searchPage;
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
			loginOrSignUp = new LoginOrSignUp(driver);
			searchPage = new SearchPage(driver);
		//	forgotPasswordPage=new ForgotPasswordPage(driver);
			
		}
		@BeforeMethod
		public void openLoginPage() {
			driver.get("https://www.facebook.com/");
			//LoginOrSignUp loginOrSignUp= new LoginOrSignUp(driver);
			loginOrSignUp.sendUseName("user");
		loginOrSignUp.sendPassword("pass");
			loginOrSignUp.clickOnLoginButton();
			
			}
		
		@Test
		public void SearchName() {
			//SearchPage searchPage =new SearchPage (driver);
			searchPage.ClickSearch();
			SoftAssert softAssert =new SoftAssert ();
			Assert.assertEquals("SahilArora","SahilArora","it should be print");
			softAssert.assertAll();
			
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
			searchPage=null;
		}
		

		@AfterTest
		public void CloseBrowser() {
			driver.quit();
			driver=null;
		}
		
		
		
}
