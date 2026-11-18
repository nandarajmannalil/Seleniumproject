package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	
	@BeforeEach
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.get("https:www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception
	{
		Thread.sleep(2000);//java wait,used to wait for a particular period of time here (2000 milli seconds) 
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Mobiles");
		search.submit();
		
		Thread.sleep(3000);
		
		System.out.println("Mobiles :"+driver.getTitle());
		
		//search electronics
		search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.clear();
		search.sendKeys("Electronics");
		search.submit();
		
		Thread.sleep(3000);
		
		System.out.println("Electronics:"+driver.getTitle());
	}

}
