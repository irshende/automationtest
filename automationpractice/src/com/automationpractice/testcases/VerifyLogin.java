/**
 * 
 */
package com.automationpractice.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationpractice.LoginPage;

/**
 * @author Ishan
 *
 */
public class VerifyLogin {

	@Test
	public void verifyLogin()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Webdrivers\\\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("http://automationpractice.com/index.php");
	
	LoginPage login=new LoginPage(dr);
	login.clickonsignin();
	dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	login.logintoMyStore("irshende408@gmail.com", "12345");
	dr.quit();
}
}
