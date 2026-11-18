package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode 
{
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();
		URI obj = new URI(url);
		URL link =obj.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		int responsecode = con .getResponseCode();
		System.out.println("Response code is"+responsecode);
		
		if (responsecode==200)
		{
			System.out.println("Valid link");
		}
		else if(responsecode==404)
		{
			System.out.println("Broken link");
		}
		else
		{
			System.out.println("Other response code");
		}
	}
	

}
