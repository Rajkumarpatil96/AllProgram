package listnerPackage;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilityPackage.utilityusingproprtyfile;

public class Listener1 implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Your Test case is Started",true);
		ITestListener.super.onTestStart(result);
	}@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Sorry test case is fail",true);
		
		ITestListener.super.onTestFailure(result);
	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Your test case is Skipped");
		ITestListener.super.onTestSkipped(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Congrats your test case is pass");
		ITestListener.super.onTestSuccess(result);
	}

}
