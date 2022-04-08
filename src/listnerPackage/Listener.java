package listnerPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Your test case is started",true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Sorry your test case is fail",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Congrats test case is passed",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Your test case is skipped",true);
		ITestListener.super.onTestSkipped(result);
	}

}
