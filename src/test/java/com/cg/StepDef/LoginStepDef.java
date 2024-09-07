package com.cg.StepDef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cg.ExcelReader.ExcelReader;
import com.cg.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef extends ExcelReader {
	LoginPage lp;
	WebDriver driver; 
 	
//**************Login using PhoneNumber*****************
    @Given("user is on the 99acres HomePage Website1")
	public void user_is_on_the_99acres_home_page_website1() { 
    	lp= new LoginPage();
    }
    @When("user clicks on dropdown to select loginRegister1")
	public void user_clicks_on_dropdown_to_select_login_register1() {
    	lp.Dropdown();
	}
	@When("user clicks on LoginRegister1")
	public void user_clicks_on_login_register1() {  
		lp.Login();
	}	
	@When("user enters the number")
	public void user_enters_the_number() throws InterruptedException {
		Thread.sleep(5000);
		lp.PhoneNumber();
	}	
	@When("user clicks continue after entering the number")
	public void user_clicks_continue_after_entering_the_number() {
	  lp.Continue();
	}
	@When("user enters otp")
	public void user_enters_otp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    //otp entered manually
	}
	@When("user clicks on submit1")
	public void user_clicks_on_submit1() throws InterruptedException {
	Thread.sleep(7000); 
	lp.Submit();
	}  
	@Then("user is on LoginHomePage")
	public void user_is_on_login__page() {	   
	} 

//**********************Login using Email ID*******************************************
		@Given("user is on the 99acres HomePageWebsite11")
		public void user_is_on_the_99acres_home_page_website11() {
		lp=new LoginPage();
	    }
		@When("user clicks on dropdown to select LoginRegister11")
		public void user_clicks_on_dropdown_to_select_Login_Register11() {
		lp.Dropdown1();
		}
		@When("user clicks on loginRegister11")
		public void user_clicks_on_login_Register11() {     
		lp.Login1();
		}
		@When("user enters email")
		public void user_enters_email()throws InterruptedException {
		Thread.sleep(3000);
		lp.EmailID();
		}
		@When("user clicks continue after entering the EmailId")
		public void user_clicks_continue_after_entering_the_email_id() {
		lp.Continue1();
		}
		@When("user enters Password1")
		public void user_enters_password1() throws InterruptedException {
		Thread.sleep(3000);
		lp.Password();
		}
		@When("user clicks on submit11")
		public void user_clicks_on_submit11() throws InterruptedException {
		Thread.sleep(5000);     
		lp.Submit1();
	//	lp.openSectionTab();
	//	lp.switchtabs();
		}  
		@Then("user is on LoginPageHome")
		public void user_is_on_login_Page() throws InterruptedException {			
		
		}  
		
//******************Login using UserName****************************
		@Given("user is on the 99acres HomePage_Website111")
		public void user_is_on_the_99acres_home_page_website111() {
		lp= new LoginPage();		
		} 
		@When("user clicks on dropdown to select loginRegister111")
		public void user_clicks_on_dropdown_to_select_login_register111() {        
		lp.Dropdown2();
		}
		@When("user clicks on loginRegister111")
		public void user_clicks_on_login_register111() {       
		lp.Login2();
		}
		/*@When("user enters UserName")
		public void user_enters_user_name() throws InterruptedException {
		Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ErelliGreeshma");    
		lp.UserName();
		}*/

        @When("user enters {string} and {int}")
        public void user_enters_and(String string, Integer int1) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
    	   
    	ExcelReader read=new ExcelReader();
		List<Map<String, String>> test=read.getData("C:\\Users\\EGREESHM\\Desktop\\SprintExcel.xlsx",string);
		String UN=test.get(int1).get("UserName");
	    lp.UserName(UN);
        }
		@When("user clicks continue after entering the UserName")
		public void user_clicks_continue_after_entering_the_user_name() {
		lp.Continue2();
		}
		@When("user enters password11")
		public void user_enters_password11() throws InterruptedException {
		Thread.sleep(3000);
		lp.Password1();
		}
		@When("user clicks on submit111")
		public void user_clicks_on_submit111() {
		lp.Submit2();
		}
		@Then("user is on LoginPageX")
		public void user_is_on_login_page_() {		 
		} 
		
		
//****************Login Negative Scenarios*****************************
		@Given("user is on the 99acres HomePage WebsiteZZ")
		public void user_is_on_the_99acres_home_page_website_zz() {
		lp = new LoginPage();	      
		}
		@When("user clicks on dropdown to select loginRegisterZZ")
		public void user_clicks_on_dropdown_to_select_login_register_zz() {    
		lp.Dropdown3();
		}
		@When("user clicks on loginRegisterZZ")
		public void user_clicks_on_login_register_zz() {      
		lp.Login3();
		}		
		@When("user enters {string}")
		public void user_enters(String string) throws InterruptedException {
		Thread.sleep(5000);     
		lp.string(string);
		}		
		@When("user clicks on continue button")
		public void user_clicks_on_continue_button() {       
		lp.Continue3();
		}		
		@When("user enters passwordN")
		public void user_enters_password_n() throws InterruptedException {
		Thread.sleep(5000);
		lp.Password2();
		}	
		@When("user clicks on LoginZZ")
		public void user_clicks_on_login_zz() {   
		lp.Submit3();
		}
		@Then("user is on LoginPageZZ")
		public void user_is_on_login_page_zz() {
		  }  
		
//************Validate TopMenu*****************		
		
		@Given("user is on the HomePage")
		public void user_is_on_the_home_page() {
			lp = new LoginPage();
		    
		}
		@When("user clicks on TopMenu")
		public void user_clicks_on_top_menu() throws InterruptedException  {
			lp.TopMenu();
	   //Navigate To and Navigate 
			lp.moveBack();
			
		}
		@Then("user is on TopMenuPage")
		public void user_is_on_top_menu_page() {
		    
		}

//************Validate Page Information****************
	
		@Given("user is on the Website")
		public void user_is_on_the_website() {	
		lp =new LoginPage();
		}
		@When("user clicks on Buy")
		public void user_clicks_on_buy() throws InterruptedException {
		 lp.Buy();  
		}
		@When("user clicks on Rent")
		public void user_clicks_on_rent() throws InterruptedException {
		 lp.Rent();
		}
		@When("user clicks on PG \\/ Co-living")
		public void user_clicks_on_pg_co_living() throws InterruptedException {
     	lp.PG();   
		}
		@When("user clicks on Commercial")
		public void user_clicks_on_commercial() throws InterruptedException {
		lp.Commercial(); 
		}
		@When("user clicks on CoWorking")
		public void user_clicks_on_co_working() throws InterruptedException {
		lp.CoWorking();
		//lp.switchtabs();
		//lp.openSectionTab();
		}
		@Then("user is on the WebSite")
		public void user_is_on_the_web_site() throws InterruptedException {	
			
		}	
}

