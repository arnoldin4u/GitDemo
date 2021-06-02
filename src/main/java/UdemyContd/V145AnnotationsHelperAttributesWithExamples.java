package UdemyContd;

import org.testng.annotations.Test;

public class V145AnnotationsHelperAttributesWithExamples 
{	
	@Test(dependsOnMethods = "XAttributes")
	public void XAnnotations()
	{	System.out.println("Annotations");
	}
	
	@Test
	public void XAttributes()
	{	System.out.println("Attributes");
	}
	
	@Test(dependsOnMethods = {"XAttributes" , "XAnnotations"})
	public void Helper()
	{	System.out.println("Helper");
	}
	
	@Test(enabled=false , groups = {"Smoke"})
	public void ProductionError()
	{
		System.out.println("Production Error");
	}
	
	@Test(timeOut = 3000)
	public void Timeouts()
	{
		System.out.println("Timeouts");
	}
}
