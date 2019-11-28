package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demostep {
	WebDriver driver;
	String exp = "Find a Flight: Mercury Tours:";
	@Given("^lauched the browser$")
	public void lauched_the_browser() throws Throwable {
		  System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
	}

	@Given("^open the URL$")
	public void open_the_URL() throws Throwable {
		driver.get("http://demoaut.com/");
		driver.manage().window().maximize();
	}

	@When("^complete entering credentials$")
	public void complete_entering_credentials() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^validate the result$")
	public void validate_the_result() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
		System.out.println(driver.getTitle());
		Assert.assertFalse(false);
		String div=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
		System.out.println(div);
	}
	@Then("$^logout$")
	public void logout()
	{
		driver.close();
	}


}
