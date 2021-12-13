package testng.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test(priority=1)
	public void hardAssertTest() {
		Assert.assertEquals("Vivek", "Vivek");
		Assert.assertEquals("Kumar", "Kumar");
	
	}
	
	@Test(priority=2)
	public void hardAssertTest2() {
		Assert.assertEquals("vk@gmail.com", "vk@gmail.com");
	}

}
