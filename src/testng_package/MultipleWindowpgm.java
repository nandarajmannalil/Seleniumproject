package testng_package;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MultipleWindowpgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception
	{
		String parentwindow = driver.getWindowHandle();
		System.out.println("Title of google:"+driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		
		ArrayList<String>windowdetails= new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(1));//redirect back to first tab
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindow);
	}
	
	@AfterTest
	public void close() 
	{
		driver.quit();
	}

}
