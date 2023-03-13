package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelSingleData {

	@Test(dataProvider="Logindata")
	public void read(String name, String lastname) {
		System.out.println(name);
		System.out.println(lastname);
		System.out.println();
	}
		
		@DataProvider(name= "Logindata")
	public static Object[][] datas(String sheetname) throws Throwable, IOException {
		
		File file=new File ("./TestData/NewTestData1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook book = WorkbookFactory.create(fis);
		
	//	Workbook book = WorkbookFactory.create(fis);		
		Sheet sheet = book.getSheet(sheetname);
		
		int row_size = sheet.getPhysicalNumberOfRows();
		int col_size = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] data = new Object [row_size] [col_size];
		
		for(int i=0;   i<row_size-1;    i++) {
			for(int j=0;    j<col_size;   j++) {
			
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
		}

