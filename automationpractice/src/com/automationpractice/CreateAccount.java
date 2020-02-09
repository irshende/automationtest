/**
 * 
 */
package com.automationpractice;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ishan
 *
 */
public class CreateAccount 
{
	WebDriver dr;
	
By signin =By.linkText("Sign in");
By emailid=By.xpath("//input[@class='is_required validate account_input form-control']");
By submitbutton=By.id("SubmitCreate");
By titlebutton= By.id("id_gender1");
By firstname= By.name("customer_firstname");
By lastname= By.name("customer_lastname");
By password=By.name("passwd");
By address=By.id("address1");
By city =By.id("city");
By drpdown2=By.id("id_state");
By state=By.xpath("//option[@value='32']");
By zipcode=By.id("postcode");
By mobile=By.id("phone_mobile");
By register=By.id("submitAccount");
public CreateAccount(WebDriver driver)
{
	this.dr=driver;
}

public void clickonSignIn()
{
 dr.findElement(signin).click();
}

public void typeEmailId(String eid)
{
 dr.findElement(emailid).sendKeys(eid);
}

public void clickonSubmitButton()
{
	dr.findElement(submitbutton).click();
}

public void clickontitlebutton()
{
 dr.findElement(titlebutton).click();
}

public void typefirstname(String fname)
{
 dr.findElement(firstname).sendKeys(fname);
}

public void typelastname(String lname)
{
 dr.findElement(lastname).sendKeys(lname);
}

public void typepassword(String pwd)
{
 dr.findElement(password).sendKeys(pwd);
}

public void typeaddress(String addr)
{
 dr.findElement(address).sendKeys(addr);
}

public void typecity(String ct)
{
 dr.findElement(city).sendKeys(ct);
}

public void clickondrpdown2()
{
 dr.findElement(drpdown2).click();
}

public void selectstate()
{
 dr.findElement(state).click();
}

public void typezipcode(String zip)
{
 dr.findElement(zipcode).sendKeys(zip);
}

public void typemobile(String zip)
{
 dr.findElement(mobile).sendKeys(zip);
}

public void clickonregister()
{
 dr.findElement(register).click();
}

  }

