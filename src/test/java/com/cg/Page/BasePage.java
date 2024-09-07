package com.cg.Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.CustomerException.BrowserNotSupportedException;

public class BasePage {
	public static WebDriver driver;
	String bname;
	Properties prop;
	//org.dom4j.Document document;
	
	public BasePage()
	{
		prop= new Properties();
		try {
			prop.load(new FileInputStream("config/config.properties"));
			bname=prop.getProperty("browser");
			if(bname.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			}
			else if(bname.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.firefox.driver","driver//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else
			{
				throw new BrowserNotSupportedException(bname+"Not supported here");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void load()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

}


