package testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Report;

public class AmazonSearch 
{
	public boolean flag = false;
	
	@Given("i am logged in")
	public void i_am_logged_in()
	{
		if(AmazonPasswordTest.login == true)
		{
			flag = true;
		}
	}

	@When("^i search for product (.*) in price (.*)")
	public void i_search_for_product_in_price(String product,int price)
	{
		Hook.searchbox.clear();
		  Hook.searchbox.sendKeys(product+" in range "+price);
		  utility.Report.test.log(LogStatus.INFO, "searching "+product);
		  
		  
		  
		  Actions a = new Actions(Hook.driver);
		  a.sendKeys(Keys.ENTER).perform();
		  
	}
	
	@Then("results must come")
	public void results_must_come()
	{
		List<WebElement> search =  Hook.searchresult;
		 Iterator <WebElement> it =  search.iterator();
		   while(it.hasNext())
		   {
			  utility.Report.test.log(LogStatus.INFO, it.next().getText());
		   }
		   
		   try {
				utility.Report.endReport();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
