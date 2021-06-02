package UdemyContd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V130TakingWebElementPartialScreenshotWithSelenium 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement poo = driver.findElement(By.xpath("//div/input[@name='name']"));
		poo.sendKeys("Hello Angle");
		
		File src = poo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Screenshots\\screenshot1.png"));

	}

}
