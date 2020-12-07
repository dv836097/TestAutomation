package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.loginPage;
import base.testBase;

public class loginPageTest extends testBase{
loginPage login;


	
	public loginPageTest() {
		super();
	}
	
@BeforeMethod

public void setup() {
	initilization();
	login = new loginPage();
	
}


@Test
public void LoginPageTest() {
	login.Validate_LoginPage();
}

@Test
public void LoginPageTest1() {
			
login.Validate_Login(prop.getProperty("username"),prop.getProperty("password"));
	}

@Test(priority=5)
public void A_method() {
login.a_method();
}

@Test(priority=1, groups= {"TestGroup"})
public void B_method() {
login.a_method();
}

@Test(priority=1)
public void c_method() {
login.a_method();
}

@Test(priority=0)
public void D_method() {
login.a_method();
}



@AfterMethod
public void tearDown() {
driver.close();
}

}

