package Protrainingtech.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.print.Book;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Home {
	
	private static final String Parmaciast = null;
	private static final String Fashioning = null;
	public WebDriver driver;
  
	

  @Test//i
  public void f() {
	  Home ob=new Home();
	  	  
//	  Parmaciast.click();
//	  Thread.sleep(6000);
//	  Fashioning.click();
//	  Thread.sleep(6000);
//	  Book.click();
  }
  
  @BeforeClass //iv
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
  }

  @AfterClass //v
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
	  
  }

}