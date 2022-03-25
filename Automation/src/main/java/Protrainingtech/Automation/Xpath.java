package Protrainingtech.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		//WebElement searchfield=driver.findElement(By.xpath("//input[input[aria-label='search']"));
		//searchfield.sendKeys("Computer");
		driver.manage().window().maximize();
		WebElement CreateNewAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
		CreateNewAccount.click();
		Thread.sleep(6000);
		WebElement months=driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select ob=new Select(months);
		ob.selectByIndex(9);
		WebElement days=driver.findElement(By.xpath("//*[@name='birthday_day']"));
		Select obj=new Select(days);
		obj.selectByValue("26");
		WebElement Year=driver.findElement(By.xpath("//*[@name='birthday_year']"));
		Select obd=new Select(Year);
		obd.selectByValue("2019");
		
		
		
		
		
		
		
		
	}

}
