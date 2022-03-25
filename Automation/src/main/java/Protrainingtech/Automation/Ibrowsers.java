package Protrainingtech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/* i) How to open browser with selenium 
    i) Give the path of driver
    ii) Cll the chrome driver class constructor
    iii)Use the webdriver interface */
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	//How to open site in the browser
	driver.navigate().to("https://www.bbc.com");
	//driver.get("https://www.amazon.com");
	Thread.sleep(6000);
	driver.navigate().forward();
	//driver.manage().window().maximize();
	driver.getWindowHandle();
	//driver.close();
	driver.quit();
	}

}
