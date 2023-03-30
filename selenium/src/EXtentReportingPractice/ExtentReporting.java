package EXtentReportingPractice;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporting {
	

	
	public static void main(String[] args) throws IOException {
		
	ExtentReports reports= new ExtentReports("./reports/"+name()+".html");
		ExtentTest test= reports.startTest("LoginTest");
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[normalize-space(text())='Log in']")).click();
		
		test.log(LogStatus.INFO,"LoginPage is displayed" );
		
		test.log(LogStatus.INFO, test.addScreenCapture("."+screenshot(driver)));
		
		driver.findElement(By.id("Email")).sendKeys("koujalagimust@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("s1615691S@");
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  test.log(LogStatus.INFO,"Logged  in successfully" );
		
		 reports.endTest(test);
		reports.flush();
		driver.quit();
	}
	
	public static String screenshot(WebDriver driver) throws IOException {
		
		String filepath="./Screenshots/"+name()+".png";
		TakesScreenshot shot=(TakesScreenshot)driver;
		File tempfile=shot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(tempfile,new File(filepath) );
		
		return filepath;
		
	}
	public static String name() {
		String timeStamp=LocalDateTime.now().toString().replace(':', '-');
		String filepath="./Screenshots/"+timeStamp+".png";
		return timeStamp;
	}
	

}
