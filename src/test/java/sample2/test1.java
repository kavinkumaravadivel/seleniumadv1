package sample2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	String exp = "Find a Flight: Mercury Tours:";
  @Test(priority=1)
  public void Login() {
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
		System.out.println(driver.getTitle());
		Assert.assertEquals(exp, driver.getTitle());
		String div=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
		System.out.println(div);
  }
//  @Test(priority=2)
//  public void register()
//  {
//	  driver.findElement(By.linkText("REGISTER")).click();
//	  driver.findElement(By.name("firstName")).sendKeys("jj");
//	  driver.findElement(By.name("lastName")).sendKeys("kk");
//	  driver.findElement(By.name("phone")).sendKeys("phone");
//	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("kkk@gamail.com");
//	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("yuuyuuuyuuyrru");;
//	//  driver.findElement(By.cssSelector(input['name=city']));
//  }
  @BeforeTest
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demoaut.com/");
	  driver.manage().window().maximize();
  }
//  @BeforeClass
//  public void beforeclass()
//  {
//	  System.out.println("Before class invoked");
//  }
//  @AfterClass
//  public void afterClass() 
//  {
//	  System.out.println("After class invoked");
//  }
  @AfterTest
  public void aftertest()
  {
	  //driver.quit();
	 // System.out.println("Invoked");
  }
}
