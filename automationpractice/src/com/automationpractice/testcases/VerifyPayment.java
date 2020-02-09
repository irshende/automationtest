package com.automationpractice.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.automationpractice.LoginPage;


public class VerifyPayment {
	
	@Test
	public void verifyPayment()
	{
//	public static void main(String[] args) {
	   	   
		System.setProperty("webdriver.chrome.driver", "C:\\\\Webdrivers\\\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://automationpractice.com/index.php");	
		LoginPage login=new LoginPage(dr);
		login.clickonsignin();
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		login.logintoMyStore("irshende408@gmail.com", "12345");
		WebElement hover= dr.findElement(By.linkText("WOMEN"));
		Actions act=new Actions(dr);
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		act.moveToElement(hover).perform();
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		login.clickonwomenbutton();
		WebElement hover2= dr.findElement(By.xpath("//div[@class='product-container']"));
		Actions act2=new Actions(dr);
		act2.moveToElement(hover2).perform();
		login.clickonmorebutton();
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		login.clickonplusbutton();
		login.clickonaddtocart();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.clickoncheckoutbuton();
		if(dr.getPageSource().contains("$35.02"))
		{
		System.out.println("Total Cost is correct");
		}
		else
		{
		System.out.println("Total Cost is not correct");
		}
		login.clickoncheckoutbuton();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
    	login.clickonprocessaddr();
		login.clickoncheckbox();
		login.clickonprocesscarr();
		if(dr.getPageSource().contains("$35.02"))
		{
		System.out.println("Total Cost of product is correct");
		}
		else
		{
		System.out.println("Total Cost of product is incorrect");
		}
		login.clickonpaymentbutton();
		if(dr.getPageSource().contains("$35.02"))
		{
		System.out.println("Payment amount is correct");
	    }
	    else
	    {
	    System.out.println("Payment amount is incorrect");
	    }
		login.clickonconfirmbutton();
		if(dr.getPageSource().contains("$35.02"))
		{
		System.out.println("Total amount is correct");
	    }
	    else
	    {
	    System.out.println("Total amount is incorrect");
	    }
	    login.clickonbacktoorder();
	    if(dr.getPageSource().contains("$35.02"))
		{
		System.out.println("Total price is correct");
	    }
	    else
	    {
	    System.out.println("Total price is incorrect");
	    }
	    dr.quit();
	}
}

