package execuationpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import retrypack.Retry;

public class Setpriority {
	
	//@Test(retryAnalyzer=Retry.class)
	
	@Test(invocationCount=10)
	public void startthecar() {
		System.out.println("startthecar");
	}
	
	//@Test(retryAnalyzer=Retry.class)
	
	@Test
	public void firstGear() {
		System.out.println("firstGear");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void secondGear() {
		System.out.println("secondGear");
	}
	
	@Test
	public void thirdGear() {
		//Assert.assertTrue(false);
		System.out.println("thirdGear");
	}
}
