package crm.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import crm.qa.utilities.TestUtil;

public class TestBase 
{	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	
	public TestBase()
	{	
		try 
		{	prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Project\\src\\main\\java\\crm\\qa\\configurations\\config.properties");
			prop.load(ip);
		}	
		catch (FileNotFoundException e)
		{	e.printStackTrace();
		}
		catch (IOException e) 
		{	e.printStackTrace();
		}
		
	}
	public static void  initialization()
	{	String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{	System.getProperty("webdriver,chrome,chromedriver","C:\\Web Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
		}
	}
}