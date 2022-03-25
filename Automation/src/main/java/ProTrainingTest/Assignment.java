package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement CreateNewAccount=driver.findElement(By.linkText("Create New Account"));
		CreateNewAccount.click();
		
		Thread.sleep(6000);
		WebElement FirstName=driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
		FirstName.sendKeys("Naqibullah");
		
		WebElement LastName=driver.findElement(By.xpath("//*[contains(@name,'lastname')]"));
		LastName.sendKeys("Rahmatyar");
		
		WebElement PhoneNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		PhoneNumber.sendKeys("+15715238524");
		
		WebElement Password=driver.findElement(By.xpath("//input[@aria-label='New password']"));
		Password.sendKeys("Naqib@123");
		
		WebElement Month=driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select ob=new Select(Month); 
        ob.selectByIndex(3);
		
        WebElement Birthday=driver.findElement(By.xpath("//*[contains(@name,'birthday_day')]"));
        Select obd=new Select(Birthday);
        obd.selectByValue("22");
        
        WebElement BirthYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select oby=new Select(BirthYear);
        oby.selectByValue("2000");
        
        WebElement Sex=driver.findElement(By.xpath("(//*[contains(@name,'sex')])[1]"));
        Sex.click();
        
        WebElement SignUp=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
        SignUp.click();
        
    	}

}
