package ProTrainingTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithSaba {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//hot to go back syntax?
		Thread.sleep(6000);
		
		WebElement Search=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		Search.sendKeys("Computer");
		
		//driver.navigate().back();
		
		//Thread.sleep(6000);
		
		/*How to move forward syntax?
		driver.navigate().forward();
		
		//How to maximize the window?
		driver.manage().window().maximize();
		
		//How to get the window handle?
		//first we have to put it on string variable
		
		String Window=driver.getWindowHandle();
		System.out.println(Window);
		
		//hOW TO CLOSE THE BROWSER?
		driver.close(); */
		
		//What is the syntax to use the ID Locator?
		WebElement NoThanks=driver.findElement(By.id("onesignal-slidedown-cancel-button"));
		NoThanks.click();
		
		//Link text
		WebElement LinkText=driver.findElement(By.linkText("Sign Up"));
		LinkText.click();
		
		
		//Partial Link Text
		WebElement PartialLinkText=driver.findElement(By.id("user_display_name"));
		PartialLinkText.sendKeys("naqib");
		
		
		
		
		
		
		
		
		
		
		
	}

}
