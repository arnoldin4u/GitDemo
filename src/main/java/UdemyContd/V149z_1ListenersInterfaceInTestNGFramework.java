package UdemyContd;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class V149z_1ListenersInterfaceInTestNGFramework implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test execution was a success");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test execution got failed");
	}
}
