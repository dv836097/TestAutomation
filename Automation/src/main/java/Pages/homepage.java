package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testBase;

public class homepage extends testBase{
	
	//pageFactory or Object repository
	@FindBy(xpath="//a[@href='https://classic.freecrm.com/system/index.cfm?action=contact' and @title='Contacts']")
	WebElement contact;
	
	//OR initializing
		public homepage() {
			PageFactory.initElements(driver, this);
		}
		
	
	//declaring methods
		public void Validate_homepageContact() {
			
			contact.click();
			String logincontactPageTile = "CRMPRO";
			String Title = driver.getTitle();
			
			if(Title.equals(logincontactPageTile)){
				System.out.println("Contact page title verified");
			} else {
				System.out.println("TC failed");
			}
		
		}
}
