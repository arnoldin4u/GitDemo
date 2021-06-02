package UdemyContd;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class V141ExecutingTestcasesAtPackageLevelWithRegex 
{
//  Home Loan
	
	@Test
	public void WebLoginHome()
	{
		System.out.println("Web Login Home");
	}
	
	@Test
	public void APILoginHome()
	{
		System.out.println("API Login Home");
	}
	
	@Test
	public void MobileLoginHome()
	{
		System.out.println("Mobile Login Home");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileValidation()
	{
		System.out.println("Mobile Validation");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Hi I m before method");
	}
}
