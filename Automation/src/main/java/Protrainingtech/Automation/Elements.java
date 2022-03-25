package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//Todo Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	/* WebElement Rgstred= driver.findElement(By.id("nf-field-27"));
	Thread.sleep(6000);
	Rgstred.click();
	// How we locate Link text
	WebElement Register=driver.findElement(By.linkText("Register"));
	Thread.sleep(6000);
	Register.click();
	//How to find the Selenuim
	WebElement SDET=driver.findElement(By.linkText("Selenium SDET"));
	SDET.click();*/
	WebElement Searchfield=driver.findElement(By.name("field-keywords"));
	Searchfield.sendKeys("Computer");
	WebElement Searchclickicon=driver.findElement(By.xpath("/html/body/div/header/div/div/div/"));
	Searchclickicon.click();
	
	}
}
