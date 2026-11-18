package testng_package;

import org.testng.annotations.Test;

public class DependsOnMethods_pgrm {
	
	@Test
	public void reg()
	{
		System.out.println("Registration Method");
	}
	
	@Test (dependsOnMethods ="reg")//login method is depend on the reg() method so it will work only after execute the after method
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(dependsOnMethods ={"reg","login"})
	public void home()
	{
		System.out.println("Home Method");
	}

}
