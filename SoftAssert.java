package testng.Assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {
	
	org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp() {
		sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority=1)
	public void softAssertTest() {
		
		sf.assertEquals("Vivek", "Vivek");
		sf.assertEquals("Kumar", "Kumar");
		sf.assertEquals("vk@gmail.com", "vk@gmail.com");
		sf.assertEquals("", "9304684310");
		sf.assertEquals("", "QA");
		sf.assertAll();
	}
	
	@Test(priority=2)
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}

	

	
}
