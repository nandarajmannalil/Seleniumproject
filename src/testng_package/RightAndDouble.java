package testng_package;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightAndDouble {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
				
	}
	@Test
	public void login()
	{
		WebElement doublebutton = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		
	}

}
