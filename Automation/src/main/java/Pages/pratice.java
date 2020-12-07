package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.testUtil;

public class pratice {
	
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	
	System.setProperty("webdriver.chrome.driver","G:/Dinesh/chromedriver.exe");
	driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(testUtil.page_load_timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(testUtil.implicit_Wait, TimeUnit.SECONDS);
	driver.get("https://classic.crmpro.com");

}
}
