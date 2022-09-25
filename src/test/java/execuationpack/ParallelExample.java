package execuationpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExample {
	
	static WebDriver driver;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		long id = Thread.currentThread().getId();
		System.out.println("openGoogle"+id);
	}

	@Test
	public void amzone() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.navigate().to("https://www.amazon.in/");
		long id = Thread.currentThread().getId();
		System.out.println("amzone"+id);
	}
	
	@Test
	public void flipkart() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.navigate().to("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println("flipkart"+id);
	}
	
	@Test
	public void bing() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.navigate().to("https://www.bing.com/");
		long id = Thread.currentThread().getId();
		System.out.println("bing"+id);
	}

}
