package UdemyContd;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class V129InvokingMultipleWindowsTabsFromSelenium 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/#/index");
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		List<WebElement> links = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"));
		String title = links.get(1).getText();
		
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(title);

	}

}