package seleniumpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("Title of the web page :"+actualtitle);
	}
	
	@Test
	public void textverification()
	{
		String sourcecode=driver.getPageSource();
		if(sourcecode.contains("Userlogin"))
		{
			System.out.println("Test is present");
		}
		else
		{
			System.out.println("Test is not present");
		}
	}
	
	@Test
	public void Login()
	{
		WebElement username=driver.findElement(By.id("Ulogin"));
		username.sendKeys("abcd");
		WebElement password=driver.findElement(By.name("upass"));
		password.sendKeys("QWERTY123");
		WebElement Loginbutton =driver.findElement(By.id("Sub_loginbutton"));
		Loginbutton.click();
	}

}
