package sample2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Program3 {
	WebDriver driver;
  @Test
  public void moveto() {
	  WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  WebElement ouroffice = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  WebElement location = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
	  Actions act = new Actions(driver);
	  act.moveToElement(aboutus).click().build().perform();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
	  act.moveToElement(ouroffice).click().build().perform();
	  wait.until(ExpectedConditions.elementToBeClickable(location));
	  act.moveToElement(location).click().build().perform();
	  String parentwindow = driver.getWindowHandle();
	  System.out.println(parentwindow);
	  Set <String> childwindow = driver.getWindowHandles();
	  for (String s:childwindow)
	  {
		  System.out.println(s);
		  driver.switchTo().window(s);
	  }
	  //driver.switchTo().window(window);
	  driver.switchTo().frame(1);
	  String address = driver.findElement(By.tagName("address")).getText();
	  System.out.println(address);
	  driver.quit();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
