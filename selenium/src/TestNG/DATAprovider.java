package TestNG;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTest.ReadExcelSingleData;

public class DATAprovider {
	
	@Test(dataProvider="logindata")
	public void read(String name, String lastname) {
		System.out.println(name);
		System.out.println(lastname);
		System.out.println();
	}

	
	//Method Matcher exception when the data passing in diffrent methods 
	
	@DataProvider(name="logindata")
	public Object[][] testData()  throws Throwable {
	
		return ReadExcelSingleData.datas("Sheet1");
		
	}
}
