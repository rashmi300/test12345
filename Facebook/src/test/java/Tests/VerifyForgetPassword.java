package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import page.ForgotPasswordPage;
import page.LoginOrSignUp;
import page.SearchPage;
import page.logoutpage;

public class VerifyForgetPassword {
	
	private WebDriver driver;
	private ForgotPasswordPage  forgotPasswordPage;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browsername){
		if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		driver= new ChromeDriver(option);
		}
		
		if (browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
					
//			//ChromeOptions option = new ChromeOptions();
//			//option.addArguments("disable-notifications");
			driver= new EdgeDriver();
	
	}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@BeforeClass
	public void createPOMobject() {
		//loginOrSignUp = new LoginOrSignUp(driver);
	//	searchPage = new SearchPage(driver);
		forgotPasswordPage=new ForgotPasswordPage(driver);
		
	}
	
	@BeforeMethod
	public void openLoginPage() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
	}
		
	@Test
	public void ClickForgetPass() {
		//ForgotPasswordPage forgotPasswordPage= new ForgotPasswordPage(driver);
		forgotPasswordPage.clickforgotPassword();
		forgotPasswordPage.verifytextmassage();
		forgotPasswordPage.sendEmailid();
		forgotPasswordPage.clickSearch();
		forgotPasswordPage.clickClose();
		
	}
	
	 
	 
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		driver=null;
	}
	

}
