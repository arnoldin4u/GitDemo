package UdemyContd2;

import org.testng.annotations.Test;

public class V160_2SwitchingTheTestsWithMavenProfiling 
{	@Test(groups= {"Smoke"})
	public void MavenFullSwing4()
	{
		System.out.println("Maven Full Swing 4");
	}
	@Test
	public void MavenFullSwing5()
	{
		System.out.println("Maven Full Swing 5");
	}
	@Test(groups = {"Regression"})
	public void MavenFullSwing6()
	{
		System.out.println("Maven Full Swing 6");
	}

}
