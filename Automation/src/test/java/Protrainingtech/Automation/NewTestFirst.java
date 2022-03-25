package Protrainingtech.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestFirst {
  WebDriver driver;
	@Test//i
  public void f() {
	  System.out.println("This test");
  }
  @BeforeMethod//ii
  public void beforeMethod() throws InterruptedException, IOException {
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
	//  System.setProperty("webdriver.edge.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\msedgedriver.exe");
	  //driver = new FirefoxDriver();
	//  driver=new EdgeDriver();
	 name("Edge");
	  Thread.sleep(6000);
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  driver.get("https://www.bbc.com");
	  shots();
	  
  }

  @AfterMethod//iii
  public void afterMethod() {
	  System.out.println("This is after method");
  }

  public void name (String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
	  } else if (browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  } else if (browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
  }
  
  public void shots() throws IOException {
	  Date dt=new Date();	  
	  String it= dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(it);
	  System.out.println(dt);
	  
	  File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshot,  new File("C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\Pictures\\Amazona.jpg"));
  }
  
  @BeforeClass//iv
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This si after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is afteSuite");
  }

}
