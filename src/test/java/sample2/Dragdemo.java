package sample2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Dragdemo {
	WebDriver driver;
  @Test
  public void Drag() {
	  WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	  Actions act = new Actions(driver);
	  act.dragAndDropBy(resize, 10000, 40000).perform();		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
