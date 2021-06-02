package UdemyContd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class V150RunningTestsInParallelAndGeneratingReports 
{	@Test
	public void successTestcase()
	{
		System.out.println("Test case is Passed ");
	}
	@Test
	public void failedTestcase()
	{
		System.out.println("Test case got Failed");
		Assert.assertTrue(false);
	}
}
