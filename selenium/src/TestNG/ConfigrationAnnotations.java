package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ConfigrationAnnotations {
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");	
	}
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");	
	}


@Test
public void run() {
	System.out.println(" HEllo");
	// threadPoolSize=2  mean its like parallel execution , the parallel browser will lanch 2 times once.
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");  
	driver.quit();
}
@AfterMethod
public void AfterMethod() {
	System.out.println("After Method");
}
@AfterClass
public void AfterClass() {
	System.out.println("After Class");
}
@AfterTest
public void AfterTest() {
	System.out.println("After Test");	
	}
@AfterSuite
public void AfterSuite() {
	System.out.println("After Suite");	
	}

}



