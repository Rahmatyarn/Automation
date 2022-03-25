package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.kayak.com/flights");
		driver.manage().window().maximize();
				
	   //Drop Down Menu
		
		WebElement CreateNewAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		CreateNewAccount.click();
		
		Thread.sleep(6000);
		WebElement months= driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select ob=new Select(months);
		ob.selectByIndex(8);
		
		WebElement days= driver.findElement(By.xpath("//*[@name='birthday_day']"));
		Select ob6=new Select(days);
		ob6.selectByValue("18");
		
		WebElement year= driver.findElement(By.xpath("//*[@name='birthday_year']"));
		Select ob7=new Select(year);
		ob7.selectByValue("2010");
		WebElement Gender= driver.findElement(By.xpath("(//*[@value='2'])[3]"));
		Gender.click();
		
		
		Thread.sleep(6000);
		WebElement Submit= driver.findElement(By.name("submit"));
		Submit.click();
		driver.switchTo().alert().dismiss(); 
		
		
	    WebElement Departure=driver.findElement(By.xpath("//*[@aria-label='August 11, 2021']"));
		Departure.click();
		
		Thread.sleep(6000);
		
		WebElement date=driver.findElement(By.xpath("//*[@aria-label='September 15, 2021']"));
		date.click(); 
		
	}

}
