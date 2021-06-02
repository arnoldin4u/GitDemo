package UdemyContd;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V138ImportanceOfXMLFileInTestNGConfiguration
{	
	@Test
	public void TestNG()
	{
		System.out.println("Welcome");
	}
	
	@BeforeTest
	public void TestNG1()
	{	
		System.out.println("I will execute first");
		System.out.println("Thank Youu");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I'll come at the very first of the suite");
	}
}
