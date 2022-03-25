package Protrainingtech.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionOfPointersinJava {
static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Actions ob=new Actions (driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*WebElement loggs=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(6000);
		ob.moveToElement(loggs).build().perform();
		Thread.sleep(6000);
		WebElement Subscriberslinks=driver.findElement(By.linkText("Subscribe & Save Items"));
		ob.moveToElement(Subscriberslinks).click().build().perform(); 
		
		WebElement dropableclicks=driver.findElement(By.linkText("Droppable"));
		dropableclicks.click();
		driver.switchTo().frame(0);
		WebElement dragged=driver.findElement(By.id("draggable"));
		WebElement droped=driver.findElement(By.id("droppable"));
		Thread.sleep(6000);
		ob.dragAndDrop(dragged, droped).build().perform();
		driver.switchTo().parentFrame();
		WebElement resizeablelinksd=driver.findElement(By.linkText("Resizalbe"));
		resizeablelinksd.click();
		driver.switchTo().frame(0);
		WebElement dr=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		ob.dragAndDropBy(dr, 0, 100). build().perform();*/
		
		WebElement fields=driver.findElement(By.name("field-keywords45"));
		fields.sendKeys("computer");
		Thread.sleep(3000);
		//fields.sendkeys(Keys.Enter);
		//ob.sendkeys(fields, Keys.Enter).perform();
		
		//ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//Thread.sleep(6000);			
	

	}

}
