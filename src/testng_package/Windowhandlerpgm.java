package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlerpgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentwindow = driver.getWindowHandle();//details of parent window
		
		WebElement searchbar= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Mobiles");
		
		WebElement icon = driver.findElement(By.xpath(""));
		
	}
	

}
