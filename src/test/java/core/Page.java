package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class Page 
{
	
	public static WebDriver driver = null;
	
	public void openBrowser(String browser,String url) // define
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		  // driver.get(url); // cannot go back / forward -> not prefererd
		      // or
		   driver.navigate().to(url);  // can go back / forward -> prefered
		   
		     
		   PageFactory.initElements(driver, this); // reading external xpath
		// implicit wait..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // one time
		
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() // define
	{
		driver.quit();
		driver.close();
	}
	

}
