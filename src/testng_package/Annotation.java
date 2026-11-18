package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation 
{
	@BeforeTest
	public void Beforetestmethod1()
	{
		System.out.println("Before Test method-----");
	}
	
	@BeforeClass
	public void Beforeclassmethod2()
	{
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void method_X()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void Testmthd_C()
	{
		System.out.println("Test method A---");
	}
	
	@AfterMethod
    public void Afmethod()
    {
		System.out.println("After method");
    }
	
	@AfterClass
	public void Afterclassmthd()
	{
		System.out.println("After class method");
	}
	
	@AfterTest
	public void Aftertestmethod()
	{
		System.out.println("After test method");
	}

}
