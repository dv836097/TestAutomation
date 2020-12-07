package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.loginPage;
import base.testBase;


public class HomePageTest extends testBase{	
	loginPage login;
	Pages.homepage homepage;
	
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initilization();
		login = new loginPage();
		login.Validate_Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test
	public void HomePage_COntactTest() {
		homepage=new Pages.homepage();
		homepage.Validate_homepageContact();
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();
	}

}
