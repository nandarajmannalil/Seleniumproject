package POMpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;//to locating webelements using page factory 
	
	@FindBy(xpath ="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	// constructors
	public Loginpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void setvalues()
	{
		username.sendKeys("ebin.luminar@gmail.com");
		password.sendKeys("123456");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title= driver.getTitle();
				return title;
	}


	
	

}
