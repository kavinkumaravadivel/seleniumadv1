package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LibraryFunctions.Browserfactory;
import pages.login;

public class Tests {
  @Test(priority =1)
  public void testlogin() {
	  WebDriver driver = Browserfactory.startbrowser("Chrome","http://demoaut.com/");
	  login login = new login(driver);
	  login.setvalue("tutorial", "tutorial");
	  Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
  }
  @Test(priority =2)
  public void testbooking()
  {
	  
  }
  
}
