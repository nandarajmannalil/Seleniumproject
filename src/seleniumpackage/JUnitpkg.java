package seleniumpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitpkg {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
     @Test
     public void titleverification()
     {
    	 String actualtitle = driver.getTitle();
    	 String expectedTitle="Google";
    	 if(expectedTitle.equals(actualtitle))
    	 {
    		System.out.println("Same title"); 
    	 }
    	 else
    	 {
    		 System.out.println("Mismatch Title");
    	 }
     }
     @Test
     public void Method2()
     {
    	 System.out.println("Method2");
     }
     
     @AfterEach
     public void closingmethod()
     {
    	 System.out.println("aftereachmethod");
    	 //driver.close();//to close a particular tab
    	 driver.quit();
     }
}
