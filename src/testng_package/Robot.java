package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Robot {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuploadmthd()
	{
		WebElement buton=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		
	}
	public void fileUpload(String p) throws Exception
	{
		
	}

}
