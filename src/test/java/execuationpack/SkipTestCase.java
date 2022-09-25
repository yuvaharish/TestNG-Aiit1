package execuationpack;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(groups= {"apple"})
	public void startthecar() {
		System.out.println("apple");
	}
	
	@Test(groups= {"apple"})
	public void firstGear() {
		System.out.println("apple");
	}
	
	@Test(groups= {"vivo"})
	public void secondGear() {
		System.out.println("vivo");
	}
	
	@Test(groups= {"vivo"})
	public void thirdGear() {
		System.out.println("vivo");
	}
	
	@Test(groups= {"vivo"})
	public void onMusic() {
		System.out.println("vivo");
	}
}
