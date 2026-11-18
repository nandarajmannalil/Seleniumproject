package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groupingpgrm {
	
	@BeforeClass
	public void bfclassmthd()
	{
		System.out.println("Before class method");
	}
	
	@Test(priority=1, groups ="smoke")
	public void testmthd()
	{
		System.out.println("Test Method----");
	}
	
	@Test (priority=2,groups="Sanity")
	public void testmthdtwo()
	{
		System.out.println("Test Method two------");
	}
	
	@Test (priority=3,groups = {"Regresion","Smoke"})
	public void testmthdthree()
	{
		System.out.println("Test Method Three----");
	}
	
	@AfterClass
	public void AfterClassmthd()
	{
		System.out.println("After Class Method-----");
	}

}
