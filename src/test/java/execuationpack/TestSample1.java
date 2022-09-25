package execuationpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample1 {
	
	WebDriver driver;
	
	long startTime;
	long totaltime;
	
	
	
	@BeforeSuite
	public void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		startTime = System.currentTimeMillis();
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		long endTime = System.currentTimeMillis();
		long totaltime=endTime-startTime;
		System.out.println("closeBrowser total time : "+totaltime);
	}
	
	@Test
	public void openGoogle() {
		driver.navigate().to("https://www.google.com/");
		long endTime = System.currentTimeMillis();
		long totaltime=endTime-startTime;
		System.out.println("openGoogle total time : "+totaltime);
	}

	@Test
	public void amzone() {
		driver.navigate().to("https://www.amazon.in/");
		long endTime = System.currentTimeMillis();
		long totaltime=endTime-startTime;
		System.out.println("amzone total time : "+totaltime);
	}
	
	@Test
	public void flipkart() {
	driver.navigate().to("https://www.flipkart.com/");
	long endTime = System.currentTimeMillis();
	long totaltime=endTime-startTime;
	System.out.println("flipkart total time : "+totaltime);
	}

}
