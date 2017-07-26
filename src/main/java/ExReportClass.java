import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExReportClass {
		WebDriver driver;
		static ExtentReports report;
		static ExtentTest logger;
		
	public static void extntReports(String testName, String StepName){
		report = new ExtentReports("C:\\");
		logger = report.startTest(testName);
		logger.log(LogStatus.INFO, StepName);
		logger.addScreenCapture("C:\\");
	}
}
