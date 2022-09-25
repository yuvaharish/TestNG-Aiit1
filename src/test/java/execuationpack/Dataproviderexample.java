package execuationpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderexample {
	static WebDriver driver;
	
	@DataProvider(name="datalogin")
	public String[][] loginData() {
		
		String[][] data= {
				{"Admin","admin12"},
				{"Adm","admin123"},
				{"Admi","admin12"},
				{"Admin","admin123"}
				};
		return data;
	}
	
	public String[][] readexceldata() throws IOException {
		File file = new File("");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int noofRow = sheet.getPhysicalNumberOfRows();
		int noofColum = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[noofRow][noofColum];
		
		for (int i = 0; i < noofRow-1; i++) {
			for (int j = 0; j <noofColum; j++) {
			DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
				
			}
		}
		return data;
	}
	
	@BeforeSuite
	public void loadbrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closebrowser() {
		//driver.quit();
	}
	
	@Test(dataProvider="datalogin")
	public void ornghrm(String name,String pass) {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(name);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();
	}

}
