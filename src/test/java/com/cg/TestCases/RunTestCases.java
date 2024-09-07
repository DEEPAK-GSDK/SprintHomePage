package com.cg.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cg.Pages.LoginPage;

import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class RunTestCases extends LoginPage {

	public RunTestCases()
	{
		super();	
	}
	
  //load url
  @Test(priority=1)
	public void loadurl()
	{
	 Assert.assertEquals(driver.getCurrentUrl(), "https://www.99acres.com/");
	 System.out.println("Url is loaded");	
	}
   
  //verify page title
	@Test(priority=2)
    public void pageTitle()
    {
       Assert.assertEquals(driver.getTitle(), "India Real Estate Property Site - Buy Sell Rent Properties Portal - 99acres.com"); 
       System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe" );
       driver=new ChromeDriver();
       driver.get("https://www.99acres.com/");
       System.out.println("PageTitle is verified");
    }
	
  //For Buyers
	@Test(priority=6)
	public void heading1() throws InterruptedException {
		Thread.sleep(3000);
	 WebElement el=driver.findElement(By.linkText("For Buyers"));
    Actions act1=new Actions(driver);
    act1.moveToElement(el).build().perform();
    System.out.println("'For Buyers' Heading is validated");
    }
  //For Tenants;
	@Test(priority=5)
    public void heading2() throws InterruptedException {
		Thread.sleep(3000);
    WebElement e2=driver.findElement(By.linkText("For Tenants"));
    Actions act2=new Actions(driver);
    act2.moveToElement(e2).build().perform();
    System.out.println("'For Tenants' Heading is validated");
    }
  //For Owners
	@Test(priority=4)
    public void heading3() throws InterruptedException {
		Thread.sleep(3000);
    WebElement e3=driver.findElement(By.linkText("For Owners"));
    Actions act3=new Actions(driver);
    act3.moveToElement(e3).build().perform();
    System.out.println("'For Owners' Heading is validated");
    }
  //For Dealers / Builders
	@Test(priority=3)
	public void heading4() throws InterruptedException {
		Thread.sleep(3000);
    WebElement e4=driver.findElement(By.linkText("For Dealers / Builders"));
    Actions act4=new Actions(driver);
    act4.moveToElement(e4).build().perform();
    System.out.println("'For Dealers / Builders' Heading is validated");
	}
}


