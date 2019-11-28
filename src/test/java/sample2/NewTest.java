package sample2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver conductor;
  @Test
  public void Login() {
	  System.out.println("block");
	  conductor.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	  System.out.println(conductor.switchTo().alert().getText());
	  conductor.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	  conductor = new ChromeDriver();
	  conductor.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  conductor.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 // conductor.close();
  }

}
