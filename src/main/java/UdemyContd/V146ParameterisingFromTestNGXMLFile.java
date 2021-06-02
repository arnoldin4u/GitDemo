package UdemyContd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V146ParameterisingFromTestNGXMLFile
{		
		@Parameters({"URL"})
		@Test
		public void Parameterisation(String url)
		{
			System.out.println(url);
		}
}
