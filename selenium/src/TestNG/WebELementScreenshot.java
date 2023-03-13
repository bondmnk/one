package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WebELementScreenshot {

	public static void main(String[] args) throws Throwable {
		

		System.out.println(" HEllo");
		// threadPoolSize=2  mean its like parallel execution , the parallel browser will lanch 2 times once.
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");  
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		Actions actions=new Actions(driver);
			actions.moveToElement(element, 50, 10).build().perform();
		

		
		/* File temp=element.getScreenshotAs(OutputType.FILE);
		
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		
		File dest=new File("./Screenshoot/Element"+timestamp+".png");
		
		FileHandler.copy(temp, dest);
		driver.quit();
		*/
	}

}
