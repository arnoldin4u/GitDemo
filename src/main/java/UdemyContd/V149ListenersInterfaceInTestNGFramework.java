package UdemyContd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class V149ListenersInterfaceInTestNGFramework 
{
	@Test
	public void listenerSuccess()
	{
		System.out.println("Execution Passed");
	}
	
	@Test
	public void listenerFailure()
	{
		System.out.println("Execution Failed");
		Assert.assertTrue(false);
	}
}
