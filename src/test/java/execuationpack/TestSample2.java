package execuationpack;

import org.testng.annotations.Test;

public class TestSample2 {
	
	@Test(groups= {"apple"})
	public void apple() {
		System.out.println("apple");
	}

	@Test(groups= {"apple"})
	public void samsung() {
		System.out.println("apple");
	}
	
	@Test(groups= {"apple"})
	public void vivo() {
		System.out.println("apple");
	}
}
