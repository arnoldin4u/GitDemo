package UdemyContd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;

public class V127IntroductionToRelativeLocatorsPart1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement poo = driver.findElement(By.xpath("//div/input[@name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(poo)).getText());
		
		WebElement poo1 = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(poo1)).sendKeys("29/11/1983");

		WebElement poo2 = driver.findElement(By.cssSelector("label[for='exampleFormControlRadio1']"));
		driver.findElement(withTagName("input").toRightOf(poo2)).click();
		
		WebElement poo3 = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(withTagName("input").toLeftOf(poo3)).click();
		
		
		
		
		
		
		
	}

}
