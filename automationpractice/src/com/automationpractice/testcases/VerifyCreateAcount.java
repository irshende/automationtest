/**
 * 
 */
package com.automationpractice.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.automationpractice.CreateAccount;

/**
 * @author Ishan
 *
 */
public class VerifyCreateAcount {

	@Test
	public void verifyCreateAccount()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Webdrivers\\\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://automationpractice.com/index.php");
		
		CreateAccount create=new CreateAccount(dr);
		create.clickonSignIn();
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		create.typeEmailId("secretangel543@gmail.com");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		create.clickonSubmitButton();
		create.clickontitlebutton();
		create.typefirstname("Ishan");
		create.typelastname("Shende");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		create.typepassword("12345");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		create.typeaddress("Pratap Nagar");
		create.typecity("Nagpur");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		create.clickondrpdown2();
		create.selectstate();
		create.typezipcode("44002");
		create.typemobile("8945122222");
		create.clickonregister();
		dr.quit();
	}

}
