package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		/*WebElement loggss=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(loggss).build().perform();
		WebElement Subscriberslink=driver.findElement(By.linkText("Subscribe & Save Items"));
		ob.moveToElement(Subscriberslink).click().build().perform();
		WebElement dropableclicks=driver.findElement(By.linkText("Droppable"));
		dropableclicks.click();
		driver.switchTo().frame(0);
		WebElement Dragged=driver.findElement(By.id("draggable"));
		WebElement droped=driver.findElement(By.id("droppable"));
		Thread.sleep(6000);
		ob.dragAndDrop(Dragged, droped).build().perform();
		//how to move to parent frame
		driver.switchTo().parentFrame();
		WebElement resizeablelink=driver.findElement(By.linkText("Resizable"));
		resizeablelink.click();
		driver.switchTo().frame(0);
		WebElement dr=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		ob.dragAndDropBy(dr, 0, 120).build().perform();
		
		
		WebElement fields=driver.findElement(By.name("field-keywords"));
		fields.sendKeys("Computer");
		Thread.sleep(3000);
		//fields.sendKeys(Keys.ENTER);
		
		//ob.sendKeys(fields, Keys.ENTER).build().perform();
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.DELETE).perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("V").perform();*/
		
		
		
		
	}

}
