package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
	ChromeDriver driver ;
	
	@BeforeEach
	public void webpage()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void locate()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result = logo. isDisplayed();
		if(result==true)
		{
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is not displayed");
		}
		WebElement gender = driver.findElement(By.xpath("//input[@value='f']"));
		boolean buttonenb=gender.isEnabled();
		System.out.println("Gender button is enabled"+buttonenb);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean checkboxbtn = checkbox.isSelected();
		if(checkboxbtn==true)
		{
			System.out.println("Checkbox is selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			checkbox.click();
		}
	}
	

}
