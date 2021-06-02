package UdemyContd;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class V147V148DataProviderAnnotationParameterisingTestCases1_2 
{	
	@Test(dataProvider = "DataProvider")
	public void getData(String userName , String password)
	{	
		System.out.println();
		System.out.println(userName);
		System.out.println(password);
		System.out.println();
	}
	
	
	@DataProvider
	public Object[][] DataProvider()
	{
		Object[][] data = new Object[3][2];
		// 1st data set
		data[0][0] = "username1";
		data[0][1] = "password1";
		// 2nd data set
		data[1][0] = "username2";
		data[1][1] = "password2";
		//  3rd data set
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	}
}
