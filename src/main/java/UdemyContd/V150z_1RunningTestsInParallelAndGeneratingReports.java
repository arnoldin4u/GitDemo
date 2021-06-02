package UdemyContd;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class V150z_1RunningTestsInParallelAndGeneratingReports implements ITestListener
{	@Override
	public void onTestSuccess(ITestResult result)
	{	System.out.println("Test case was a Success");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{	System.out.println("Test case was a flop");
		System.out.println("Failed test case : " + result.getName());	
	}
}
