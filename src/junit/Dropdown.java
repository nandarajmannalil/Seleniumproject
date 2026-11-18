package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	
	@BeforeEach
	public void home()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Dropdown()
	{
		WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		Select obj=new Select(day);
		obj.selectByIndex(3);
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2"));
		Select obj1=new Select(month);
		obj.selectByValue("Jan");
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select obj2 =new Select(year);
		obj.selectByVisibleText("2005");
	}

}
