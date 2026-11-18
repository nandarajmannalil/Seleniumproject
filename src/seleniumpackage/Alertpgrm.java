package seleniumpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgrm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/manna/OneDrive/Desktop/Alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception
	{
		WebElement display_alert=driver.findElement(By.xpath("/html/body/input[1]"));
		display_alert.click();
		
		//Handle alert box
		Alert alrt= driver.switchTo().alert();
		String alerttext=alrt.getText();
		System.out.println("Alert text:" +alerttext);
		alrt.accept();
		
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("/html/body/input[2]"));
		firstname.sendKeys("Nanda");
		
		WebElement lastname= driver.findElement(By.xpath("/html/body/input[3]"));
		lastname.sendKeys("Raj");
	}
	
	
		
	

}
