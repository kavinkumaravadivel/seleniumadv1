package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By username1 = By.name("userName");
	By password1 = By.name("password");
	By click = By.name("login");
	public login (WebDriver driver)
	{
		this.driver = driver;
	}
	public void setvalue(String username,String password)
	{
		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
