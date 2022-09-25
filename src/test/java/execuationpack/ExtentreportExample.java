package execuationpack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportExample {
	
	static WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@BeforeSuite
	public void loadbrowser() {
		
		extent=new ExtentReports();
		spark = new ExtentSparkReporter("spark.html");
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closebrowser() {
		//driver.quit();
		extent.flush();
	}
	
	@Test
	public void ornghrm() {
		test=extent.createTest("Verify orangelive demo");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.log(Status.INFO, "Navigat to orangehrm site");
		test.log(Status.PASS, "sucussfully navigated");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		test.log(Status.INFO, "entered the userName");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		test.log(Status.INFO, "entered the password");
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();
		test.log(Status.INFO, "sucussfully clicked login button");
		String title = driver.getTitle();
		if (title.equals("Orange")) {
			test.log(Status.PASS, "Title matched");
			screenshot();
			test.addScreenCaptureFromPath("E:\\eclipse\\July batch 3\\TestNGExample\\ornghrm.png");
		}else {
			test.log(Status.FAIL, "Title not matched");
			screenshot();
			test.addScreenCaptureFromPath("E:\\eclipse\\July batch 3\\TestNGExample\\ornghrm.png");
		}
	
	}

	
	public static void screenshot() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File file = new File("E:\\eclipse\\July batch 3\\TestNGExample\\ornghrm.png");
		try {
			FileHandler.copy(screenshotAs, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
