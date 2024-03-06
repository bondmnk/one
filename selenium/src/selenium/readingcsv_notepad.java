package selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class readingcsv_notepad {

	/*	// public static void main(String[] args) throws IOException, CsvValidationException {
		String filepath="./csv/csvfamily.csv";
		FileReader fr =new FileReader(filepath);
	/*	CSVReader scvr=new CSVReader(fr);
		String[] firstline=scvr.readNext();	
		String firstString=firstline[0];
		String secondString=firstline[1];
		String thierdString=firstline[2];
		String fourthdString=firstline[3];
		System.out.println(firstString);
		System.out.println(secondString);
		System.out.println(thierdString);
		System.out.println(fourthdString);    */
		
		
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://contacts.google.com/");    

	}


