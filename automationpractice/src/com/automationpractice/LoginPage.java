/**
 * 
 */
package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ishan
 *
 */
public class LoginPage {
	
	WebDriver dr;
	
	By signin =By.linkText("Sign in");
	By username=By.id("email");
	By password=By.name("passwd");
	By loginbutton=By.id("SubmitLogin");
	By womenbutton=By.linkText("T-shirts");
	By morebutton=By.linkText("More");
	By plusbutton=By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
	By addtocart=By.id("add_to_cart");
	By checkoutbuton=By.linkText("Proceed to checkout");
	By checkbox=By.id("cgv");
	By processaddr=By.name("processAddress");
	By processcarr=By.name("processCarrier");
	By paymentbutton=By.partialLinkText("Pay by check");
    By confirmbutton=By.xpath("//button[@class='button btn btn-default button-medium']");
	By backtoorder=By.xpath("//a[@class='button-exclusive btn btn-default']");
    
	public LoginPage(WebDriver driver)
	{
		this.dr=driver;
	}

public void logintoMyStore(String userid,String pass)
{

	dr.findElement(username).sendKeys(userid);
	dr.findElement(password).sendKeys(pass);
	dr.findElement(loginbutton).click();
}

public void clickonsignin()
{
 dr.findElement(signin).click();
}

public void typeusername(String uid)
{
dr.findElement(username).sendKeys(uid);
}

public void typepassword(String pwd)
{
 dr.findElement(password).sendKeys(pwd);
}

public void clickonloginbutton()
{
 dr.findElement(loginbutton).click();
}

public void clickonwomenbutton()
{
 dr.findElement(womenbutton).click();
}

public void clickonmorebutton()
{
 dr.findElement(morebutton).click();
}

public void clickonplusbutton()
{
 dr.findElement(plusbutton).click();
}

public void clickonaddtocart()
{
 dr.findElement(addtocart).click();
}

public void clickoncheckoutbuton()
{
 dr.findElement(checkoutbuton).click();
}

public void clickonprocessaddr()
{
 dr.findElement(processaddr).click();
}

public void clickoncheckbox()
{
 dr.findElement(checkbox).click();
}

public void clickonprocesscarr()
{
 dr.findElement(processcarr).click();
}

public void clickonpaymentbutton()
{
 dr.findElement(paymentbutton).click();
}

public void clickonconfirmbutton()
{
 dr.findElement(confirmbutton).click();
}

public void clickonbacktoorder()
{
 dr.findElement(backtoorder).click();
}

}


