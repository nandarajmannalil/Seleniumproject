package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandling {
	
	ChromeDriver driver;
	
 @BeforeTest
 public void setup() 
 {
	 driver=new ChromeDriver();
	 driver.get("https://keralaproperty.in/member/login/");
	 driver.manage().window().maximize();
 }
 @Test(priority = 1)
 public void loginmethod()
 {
	WebElement Username= driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
	Username.sendKeys("ebin.luminar@gmail.com");
	WebElement Password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
	Password.sendKeys("123456");
	WebElement Loginbutton= driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
	Loginbutton.click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("myhome"));

	
 }
  @Test 
  public void AddPropertyMethod()
  {
	WebElement AddPropertytbutton=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
	AddPropertytbutton.click();
	
	// summary comes under iframe so we need to switch to the iframe and pass values to the webelement
	WebElement FrameTag = driver.findElement(By.xpath("//[*id=\"frm_property\"]/div[9]/div/div/iframe"));
	driver.switchTo().frame(FrameTag);
	WebElement Summary = driver.findElement(By.xpath("/html/body"));
	Summary.click();
	Summary.sendKeys("benmm");
	
	driver.switchTo().defaultContent();
  }
 
 
 
}
