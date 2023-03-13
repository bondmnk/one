package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {


	// Each class having at least one test annotation is called testNg class
	//one test annotation can be used to develop one test case , the code written inside test annotation method is called test steps
 @Test(groups = "regration", threadPoolSize=2,invocationCount= 4)
 public void demo() {
	System.out.println(" HEllo");
	// threadPoolSize=2  mean its like parallel execution , the parallel browser will lanch 2 times once.
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");  
	
	}
 @Test
 public void demo1() {
	 System.out.println(" HEllo1");
 }

 @Test
 public void demo2() {
	 System.out.println(" HEllo2");
 }
 @Test
 public void demo3() {
	 System.out.println(" HEllo3");
 }

}
