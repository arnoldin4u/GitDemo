package UdemyContd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class V137RunningTestcasesInTestNGWithoutJavaCompiler
{	
	@Test
	public void TestNG()
	{
		System.out.println("Hello TestNG Framework Testing");
	}
	
	@Test(groups= {"Smoke"})
	public void simply()
	{
		System.out.println("I have reached 45% of the course");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am before class method V137");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am after class method V137");
	}
}
