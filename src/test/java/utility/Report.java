package utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report 
{
	public static ExtentReports report = null;
	public static ExtentTest test = null;	
	
	public static void generateReport(String reportname) throws Exception // define
	{
		report = new ExtentReports( System.getProperty("user.dir")+"//src//test//java//reports//"+reportname+".html");
		test = report.startTest(reportname);
	}
	
	public static void endReport() throws Exception // define
	{
		report.endTest(test);
		report.flush();
	}

}
