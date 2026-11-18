package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgrm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//for opening edge driver - EdgeDriver/EdgeDriver = new EdgeDriver
		//for opening Firefox = FireFoxDriver;
		//FirefoxDriver driver= newFireFoxDriver;
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();//to retrieve the title of the web application
		System.out.println("the title of web page application is:"+actualtitle);
		
		String expectedtitle ="Google";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("The title's matchs");
		}
		else
		{
			System.out.println("Title is not matched");
		}
	}

}
