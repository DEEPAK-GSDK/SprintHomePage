package com.cg.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cg.Page.BasePage;

public class LoginPage extends BasePage {
	
//Login using phone number
	@FindBy(xpath="//div[@data-label='USER_PROFILE_DROPDOWN']")
	WebElement Dropdown;
	@FindBy(xpath="//div[@class='P500 hyperlinks_medium bold spacer16']")
	WebElement Login;
	@FindBy(xpath="//input[@name='username']")
	WebElement Phonenumber;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")
	WebElement Continue;
	//Enter otp manually
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")
	WebElement Submit;
//Login using Email ID
	@FindBy(xpath="//div[@data-label='USER_PROFILE_DROPDOWN']")
	WebElement Dropdown1;
	@FindBy(xpath="//div[@class='P500 hyperlinks_medium bold spacer16']")
	WebElement Login1;
	@FindBy(xpath="//input[@name='username']")
	WebElement EmailID;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")  	 
	WebElement Continue1;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")
	WebElement Submit1;
//Login using UserName
	@FindBy(xpath="//div[@data-label='USER_PROFILE_DROPDOWN']")
	WebElement Dropdown2;
	@FindBy(xpath="//div[@class='P500 hyperlinks_medium bold spacer16']")
	WebElement Login2;
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")  	 
	WebElement Continue2;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password1;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")
	WebElement Submit2;
//Login Negative Scenarios
	@FindBy(xpath="//div[@data-label='USER_PROFILE_DROPDOWN']")
	WebElement Dropdown3;
	@FindBy(xpath="//div[@class='P500 hyperlinks_medium bold spacer16']")
	WebElement Login3;
	@FindBy(xpath="//input[@name='username']")
	WebElement string;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")  	 
	WebElement Continue3;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password2;
	@FindBy(xpath="//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']")
	WebElement Submit3;
//Validate TopMenu
	@FindBy(xpath="//i[@class='iconS_Common_24 icon_menuIcon hmenu__explicitSpriteSize']")
    WebElement TopMenu;
//Validate Page Information
	@FindBy(xpath="//div[@id='inPageSearchForm_0']")
    WebElement Buy;
	@FindBy(xpath="//div[@id='inPageSearchForm_1']")
    WebElement Rent;
	@FindBy(xpath="//div[@id='inPageSearchForm_2']")
    WebElement PG;
	@FindBy(xpath="//div[@id='inPageSearchForm_3']")
    WebElement Commercial;
	@FindBy(xpath="//div[@id='inPageSearchForm_4']")
    WebElement CoWorking;
	
	
	
	public LoginPage() {
		super();
		load();
		PageFactory.initElements(driver,this);
	}
	
//using phonenumber
	public void Dropdown() {
		Dropdown.click();
	}
	public void Login() {
		Login.click();
	}
	public void PhoneNumber() {
		Phonenumber.sendKeys("6304910887");
	}
	public void Continue() {
		Continue.click();
	}
	//otp entered manually 
	public void Submit() {
	    Submit.click();
    }
	
//using EmailID
	public void Dropdown1() {
		Dropdown1.click();
	}
	public void Login1() {
		Login1.click();
	}
	public void EmailID() throws InterruptedException {
		
		Thread.sleep(3000);
		EmailID.sendKeys("greeshmaerelli@gmail.com");
	}
	public void Continue1() {
		Continue1.click();
	}
	public void Password() throws InterruptedException {
		Password.sendKeys("Kiddu@011");
		Thread.sleep(3000);
	}
/*	public void switchtabs() throws InterruptedException {
		   ArrayList<String> handle=new ArrayList(driver.getWindowHandles());
		   ListIterator<String> li=handle.listIterator();
		   while(li.hasNext()) {
		   driver.switchTo().window(li.next());
		   System.out.println(driver.getTitle());
		   Thread.sleep(3000);
		}
		} 

	 public void openSectionTab() throws InterruptedException {
		 Thread.sleep(3000);
		   WebElement t=driver.findElement(By.xpath("//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']"));
		   t.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		   
	 }	    */
	
	public void Submit1() throws InterruptedException {
		  Thread.sleep(3000);
        Submit1.click();       
	}
	
	
//Login using UserName	
	public void Dropdown2() {
		Dropdown2.click();
	}
	public void Login2() {
		Login2.click();
	}
	public void UserName(String s) {
	UserName.sendKeys(s);
	}
	public void Continue2() {
		Continue2.click();
	}
	public void Password1() {
		Password1.sendKeys("Kiddu@011");
	}
	public void Submit2() {
		Submit2.click();
	}
	
//Login Negative Scenarios
	public void Dropdown3() {
		Dropdown3.click();
	}
	public void Login3() {
		Login3.click();
	}
	public void string(String s) {
		string.sendKeys(s);
	}
	
	public void Continue3() {
		Continue3.click();
	}
	public void Password2() {
		Password2.sendKeys("Kiddu@011");
	}
	public void Submit3() {
		Submit3.click();
	}	
//Validate TopMenu
	public void TopMenu() {
		 TopMenu.click();  
	}
	 public void moveBack() throws InterruptedException {
		    Thread.sleep(3000);       	
		    driver.navigate().to("https://www.99acres.com/postproperty/");
		    driver.navigate().back();
	 }
	
    
    
//Validate Page Information
	public void Buy() throws InterruptedException {
		Thread.sleep(3000);
		Buy.click();
	}
	public void Rent()  {
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(700000000));
        WebElement ok=driver.findElement(By.xpath("//div[@id='inPageSearchForm_1']"));
        wait.until(ExpectedConditions.elementToBeClickable(ok));
		Rent.click();		
	}
	public void PG() throws InterruptedException {
		Thread.sleep(3000);		
		PG.click();
	}
	public void Commercial() throws InterruptedException {
		Thread.sleep(3000);
		Commercial.click();
	}
	public void CoWorking() throws InterruptedException {
		Thread.sleep(3000);
		CoWorking.click();
	}
}	  



