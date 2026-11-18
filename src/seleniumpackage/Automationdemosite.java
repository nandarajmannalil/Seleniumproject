package seleniumpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationdemosite {
	 ChromeDriver driver;
	 
	 @BeforeEach
	 public void automation_setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void home() throws Exception
	 {
		 WebElement display_alert=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		 display_alert.click();
		 
		 Alert alrt =driver.switchTo().alert();
		 
		 String alerttext=alrt.getText();
		 System.out.println("Alert text :"+alerttext);
		 
		 Thread.sleep(2000);
		 alrt.accept();
		 
		 WebElement alertwithokandcancel=driver.findElement(null);
	 }
	 
		 
	 

}
