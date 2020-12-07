package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testBase;

public class loginPage extends testBase{
	
	//pageFactory or Object repository
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	//OR initializing
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//creating actions or methods
	
	public void Validate_LoginPage() {
		
		String actual_title = "CRMPRO  - CRM software for customer relationship management, sales, and support.";
		String title = driver.getTitle();
		 System.out.println(title);
		 
		if(title.equals(actual_title)) {
			System.out.println("TC passed-homepage verified");
		} else {
			System.out.println("TC failed");
		}
	}

	
	public void Validate_Login(String uname, String pwd) {
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
		
		String loginPageTile = "CRMPRO";
		String Title = driver.getTitle();
		if(Title.equals(loginPageTile)){
			
			System.out.println("TC passed");
		} else {
			System.out.println("TC failed");
		}
		
	}
	
	public void b_method(){
		System.out.println("Method b");
		
	}
	
	
	public void c_method(){
		System.out.println("Method c");
		
	}
	
	public void d_method(){
		System.out.println("Method d");
		
	}
	
	
	public void a_method(){
		System.out.println("Method A");
		
	}

}
