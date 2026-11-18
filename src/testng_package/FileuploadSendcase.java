package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileuploadSendcase {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void file_upmthd()
	{
		WebElement file_buton=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file_buton.sendKeys("\"C:\\Users\\manna\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-03 214042.png\"");
	}

}
