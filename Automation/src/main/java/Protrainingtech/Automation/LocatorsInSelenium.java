package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.protraining.com");
		
		//1. id:
	//	WebElement username = driver.findElement(By.id("login-username"));
	//	username.sendKeys("naqibullah.rahmatyar@yahoo.com");
		
		WebElement nextbtn = driver.findElement(By.id("login-signin"));
		nextbtn.click();
		
	    //2. Name:
		driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
		driver.findElement(By.name("signin")).click();
		
		
	}

}
