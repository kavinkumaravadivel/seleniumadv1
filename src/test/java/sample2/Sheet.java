package sample2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sheet {
	WebDriver driver;
  @Test
  public void readdata()throws IOException {
	  File file = new File("C:\\Users\\Training_c2a.05.01\\Desktop\\data.xlsx");
	  FileInputStream input = new FileInputStream(file);
	  XSSFWorkbook wb = new XSSFWorkbook(input);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  for (int i=0;i<5;i++)
	  {
		  for (int j=0,k=0;j<5;j++,k++)
		  {
		  String data = sheet1.getRow(j).getCell(i).getStringCellValue();
		  System.out.println(data);
	  }
		  wb.close();
	  }
  }
//  @BeforeTest
//  public void beforeTest() {
//	  System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
//	  driver=new ChromeDriver();
//	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
//	  driver.manage().window().maximize();
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
