package testcases;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPasswordTest 
{
	public boolean flag = false;
	
	public static boolean login = false;
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUserTest.user == true)
	    {
	    	flag = true;
	    }
	}
	@When("enter password {string}")
	public void enter_password(String pass) 
	{
	    if(flag == true)
	    {
	    	Hook.pwd.sendKeys(pass);
	    }
	}
	@When("click submit button")
	public void click_submit_button() 
	{
	    Hook.submit.click();
	}
	@Then("validate password")
	public void validate_password() 
	{    
		   try {
	  utility.Report.test.log(LogStatus.INFO, Hook.err2.getText());
		   }
		   catch(Exception e)
		   {
			   login = true;
			   utility.Report.test.log(LogStatus.INFO, "password is valid");
		   }
		   
		   
	}

}
