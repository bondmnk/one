package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class readingdata_propertiesfile{

	public static void main(String[] args) throws IOException {
		String path="./toread_propertiesfile/testdata2.properties";
		FileInputStream fin=new FileInputStream(path);
		Properties properties= new Properties();
		properties.load(fin);
		System.out.println(properties.getProperty("webdriverKey"));
			
		
	 
	}

}
