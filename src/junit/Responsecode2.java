package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode2 {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount()throws Exception
	{
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Link count ="+links.size());
		
		for(WebElement li:links)
		{
			String url =li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url) {
		try
		{
			URI obj = new URI(url);
			URL value =obj.toURL();
			HttpURLConnection con = (HttpURLConnection) value.openConnection();
			
			int responsecode = con .getResponseCode();
			
			
			if (responsecode==200)
			{
				System.out.println("Valid link "+url);
			}
			else if (responsecode==404)
			{
				System.out.println("Broken link"+url);
			}
			else
			{
				System.out.println("Other response code"+url);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
