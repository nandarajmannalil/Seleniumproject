package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void Soft_Assertion()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void Logo_verification()
	{
		WebElement logo =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean result= logo.isDisplayed();
		System.out.println(result);
		
		SoftAssert obj= new SoftAssert();
		obj.assertTrue(result);//to check whether the value of result is true 
		obj.assertAll();
		
		System.out.println();
		
	}
	@Test
	public void titleverification()
	{
	String actualtitle=driver.getTitle();
	//System.out.println(actualtitle);
	
	String expectedtitle="Rediffmail Free Unlimited Storage";
	
	SoftAssert obj = new SoftAssert();
	obj.assertEquals(expectedtitle,actualtitle);
	obj.assertAll();
	System.out.println("Success");
	}

}
