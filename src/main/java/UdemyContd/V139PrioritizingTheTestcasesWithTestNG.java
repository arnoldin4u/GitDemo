package UdemyContd;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class V139PrioritizingTheTestcasesWithTestNG
{	
	//  Car Loan
	
	@AfterTest
	public void WebLoginCar()
	{
		System.out.println("Web Login Car");
		System.out.println("I will be executed at the end");
	}
	
	@Test(groups= {"Smoke"})
	public void APILoginCar()
	{
		System.out.println("API Login Car");
	}
	
	@Test
	public void MobileLoginCar()
	{
		System.out.println("Mobile Login Car");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I'll come at the very end of the suite");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Hi I m after method");
	}
}
