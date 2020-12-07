package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.testUtil;

public class testBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public testBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Gopinath Rajini/eclipse-workspace/Automation/src/main/java/config/config.property");
			prop.load(ip);	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
public static void initilization() {

	System.setProperty("webdriver.chrome.driver", "G:/Dinesh/chromedriver.exe");
	driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(testUtil.page_load_timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(testUtil.implicit_Wait, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}
