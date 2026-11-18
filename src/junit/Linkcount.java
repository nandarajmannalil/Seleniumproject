package junit;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https//:www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void linkcountmethod()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));//tag name a
		System.out.println("Link count= "+links.size());
		
		for (WebElement li: links)
		{
			System.out.println("Link ------"+li.getAttribute("href"));
		}
	}
}
