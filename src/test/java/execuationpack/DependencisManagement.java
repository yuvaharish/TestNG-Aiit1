package execuationpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencisManagement {
	
	@Test(priority=1)
	public void highSchool() {
		System.out.println("highschool failed");
		
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("higherSecondary");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("engineering join");
	}
	
}
