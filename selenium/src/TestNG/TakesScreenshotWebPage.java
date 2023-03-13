package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotWebPage {
	public static void main(String[]args){
	System.out.println(" HEllo");
	// threadPoolSize=2  mean its like parallel execution , the parallel browser will lanch 2 times once.
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");  
	
	TakesScreenshot sc=(TakesScreenshot)driver;
	File temp=sc.getScreenshotAs(OutputType.FILE);
	
	String timestamp=LocalDateTime.now().toString().replace(':', '-');
	
	File dest=new File("./Screenshoot/"+timestamp+".pdf");
	
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		/* The printStackTrace() method in Java is a tool used to handle exceptions and errors. 
		 * It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
		 *  printStackTrace() is very useful in diagnosing exceptions.
		 */
	}
	driver.quit();
	}
	
}
