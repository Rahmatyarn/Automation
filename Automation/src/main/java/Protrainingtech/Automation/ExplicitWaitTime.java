package Protrainingtech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTime {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		
		WebDriverWait wt=new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("field-keywords45")));
		WebElement fields=driver.findElement(By.name("field-keywords45"));
		fields.sendKeys("computer");
		
		
		
		
		
		
		
	}

}
