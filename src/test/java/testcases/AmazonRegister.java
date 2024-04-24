package testcases;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonRegister extends Hook
{
	@Given("i open browser {string} and enter url {string}")
	public void i_open_browser_and_enter_url(String string, String string2) {
	    openBrowser(string,string2);
	}
	@Given("clicked sigin link")
	public void clicked_sigin_link() 
	{
	    signin.click();
	}
	@When("i click new user")
	public void i_click_new_user() 
	{
		newusersignin.click();
	}
	@Then("Registration form shuold open")
	public void registration_form_shuold_open() 
	{
	    
	}

}
