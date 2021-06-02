package UdemyContd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class V131CapturingHeightAndWidthOfWebElementForUXValidation 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement poo = driver.findElement(By.xpath("//div/input[@name='name']"));
		//  Both ways we get the same result
		System.out.println(poo.getRect().getDimension().getHeight());
		System.out.println(poo.getRect().getWidth());
		

	}

}
