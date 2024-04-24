package testcases;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUserTest extends Hook
{
	public static boolean user = false;
	
	@Given("browser {string} is open with url {string}")
	public void browser_is_open_with_url(String browser, String url) throws Exception 
	{
	    openBrowser(browser,url);
	    utility.Report.generateReport("AmazonLogin");
	    
	    utility.Report.test.log(LogStatus.PASS, "website open..");
	}
	@Given("i click signin")
	public void i_click_signin() 
	{
	    signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String userid) 
	{
	    uid.sendKeys(userid);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    ctnbtn.click();
	}
	@Then("I validate the userid")
	public void i_validate_the_userid() 
	{
		   try {
	utility.Report.test.log(LogStatus.INFO, err1.getText() );
		   }
		   catch(Exception e)
		   {
			   utility.Report.test.log(LogStatus.INFO,"userid is valid");
			   user = true;
		   }
	    
	}


}
