package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpath {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//WebElement Basictest = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		//Basictest.sendKeys("Computer");
		
		// Xpath - Contains
		//WebElement Newrelease = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'nav_cs_newreleases_cc44487baebb4b838886572fa6d70c76')]"));
		//Newrelease.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
