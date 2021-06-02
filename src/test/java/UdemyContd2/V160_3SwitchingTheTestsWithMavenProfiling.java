package UdemyContd2;

import org.testng.annotations.Test;

public class V160_3SwitchingTheTestsWithMavenProfiling 
{
	@Test(groups= {"Smoke"})
	public void MavenFullSwing7()
	{
		System.out.println("Maven Full Swing 7");
	}
	@Test
	public void MavenFullSwing8()
	{
		System.out.println("Maven Full Swing 8");
	}
	@Test(groups = {"Regression"})
	public void MavenFullSwing9()
	{
		System.out.println("Maven Full Swing 9");
	}
	
}
