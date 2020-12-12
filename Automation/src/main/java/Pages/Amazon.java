package Pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.testUtil;

public class Amazon {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "G:/Dinesh/chromedriver.exe");
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	
	
	

WebElement giftCart = driver.findElement(By.xpath("//a[@href='/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc']"));
giftCart.click();

WebElement giftCart1 = driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/img16/GiftCards/ApayLogo_2020/2_GC_homepage_tiles_400h_7_v2.jpg']"));
giftCart1.click();

WebElement giftCart2 = driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/I/515b3m9W5sL.jpg']"));
giftCart2.click();

WebElement giftCart3 = driver.findElement(By.xpath("//button[@value='500']"));
giftCart3.click();


WebElement giftCart4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/span[1]/div/span/span/input"));
giftCart4.click(); 

//driver.close();

	
}

	
}
