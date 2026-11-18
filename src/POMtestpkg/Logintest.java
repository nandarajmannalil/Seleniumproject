package POMtestpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMbasepkg.Basecls;
import POMpagepkg.Loginpage;

public class Logintest extends Basecls {// to inherit the driver information from base class.
  
	

	Loginpage obj;
	
	
	
	@BeforeMethod
	public void objectmethod()
	{
		Loginpage obj= new Loginpage(driver);
	}
	
	@Test
	public void Login_testmthd()
	{
		Loginpage obj= new Loginpage(driver);
		obj.setvalues();
		obj.loginmthd();
		
	}
	
	@Test 
	public void Title_verification()
	{
		System.out.println("obj.titlemthd");
	}

}
