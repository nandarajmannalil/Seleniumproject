package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm {
	 @BeforeClass
	 public void bclassmthd()
	 {
		 System.out.println("Before class method-----");
	 }
	 
	 @Test(priority = 1,invocationCount = 3)
	 public void mthd()
	 {
		 System.out.println("Method X------");
	 }
	 
	 @Test(priority=3)
	 public void mthdA()
	 {
		 System.out.println("Method A----");
	 }
	 
	 @Test(priority =3)
	 public void mthdF()
	 {
		 System.out.println("Method F-----");
	 }
	 
	 @AfterClass
	 public void aclassmthd()
	 {
		 System.out.println("After class Method----");
	 }

}
