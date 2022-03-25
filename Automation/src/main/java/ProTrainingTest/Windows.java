package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement kb=driver.findElement(By.linkText("Kindle Books"));
		Thread.sleep(5000);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		kb.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
	
	}

}
