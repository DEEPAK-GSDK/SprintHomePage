package com.cg.ParallelExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunParallelExecution {
	WebDriver driver;
	   
	@Test
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test
	public void Test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		driver=new ChromeDriver();	
	driver.get("https://www.99acres.com/");	
	Thread.sleep(3000);
	
	}
	
	@Test
	public void Test2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	
	}
}
