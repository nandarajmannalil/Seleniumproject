package testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hard_Assertion {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void Hard_Assertion()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
				
	}
	
	@Test(priority=1)
	public void Title_verification()
	{
		String actualtitle=driver.getTitle();
		//System.out.println(actualtitle);
		
		String expectedtitle="Rediffmail Free Unlimited  ";
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("Success");//thios line will be executed the current url of the web application
		
	}
	
	@Test(priority=2)
	public void URL_verification()
	{
	String actualurl=driver.getCurrentUrl();//to get current url of web application
	//System.out.println(actualurl);
	
	String expectedurl="https://register.rediff.com/register/register.php?FormName=user_details";
	Assert.assertEquals(expectedurl,actualurl);
	System.out.println("url verification completed");
	}

}
