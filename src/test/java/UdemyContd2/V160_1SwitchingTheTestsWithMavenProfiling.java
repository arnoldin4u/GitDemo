package UdemyContd2;

import org.testng.annotations.Test;

public class V160_1SwitchingTheTestsWithMavenProfiling
{	
	@Test(groups= {"Smoke"})
	public void MavenFullSwing1()
	{
		System.out.println("Maven Full Swing 1");
	}
	@Test
	public void MavenFullSwing2()
	{
		System.out.println("Maven Full Swing 2");
	}
	@Test(groups = {"Regression"})
	public void MavenFullSwing3()
	{
		System.out.println("Maven Full Swing 3");
	}
	@Test
	public void GitBranch1()
	{	System.out.println("GitBranch 1.0");		
	}
	
	@Test
	public void GitBranch1A()
	{	System.out.println("GitBranch 1A");		
	}
}
