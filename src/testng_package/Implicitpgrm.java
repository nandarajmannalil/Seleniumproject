package testng_package;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class Implicitpgrm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test
	public void setup()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a/span"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		
		WebElement firstoption = driver.findElement(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li/a\""));
		firstoption.click();
	}

}
