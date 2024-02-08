package practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	
	@Test
	public void logintest() {
		
		System.out.println("Login Test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"logintest"})
	public void addtocarttest() {
		
		System.out.println("add to cart test");
	}

}
