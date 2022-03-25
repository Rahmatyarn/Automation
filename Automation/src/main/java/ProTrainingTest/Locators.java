package ProTrainingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		// Locators are the way to identify an HTML Element on a WebPage, and almost all UI automation tools provide the capability to use locators for the identification of HTML elements on a WEBPage. 
		//THML Stands for HyperText Markup Language
		//We have 8 locators in Selenium (ID, Link Text, Partial Link Text, Class Name; Tags; Xpath, Css Selectos)
		//ID - With the help of ID we find the locator using ID. It's the easy and accurate way to search with the help of ID. 
		//WebElement Regster = driver.findElement(By.id("nf-field-27"));
		//Regster.click();
		
		//Link Text - We can open a link using the text available in there. 
		//Any tab <a starting with a is a link text. 
		//You will find href and a link. Also, there is a text available in the in the tag or child tag
		//How find the link text? Every link has a text and we must find the link and copy the text. 
		/* WebElement aboutus = driver.findElement(By.linkText("About Us"));
		Thread.sleep(5000);
		aboutus.click(); */
		
		/* Assignment
		
		WebElement contactus = driver.findElement(By.linkText("Contact us"));
		Thread.sleep(5000);
		contactus.click(); 
		
		WebElement SDET = driver.findElement(By.linkText("Students Portal"));
		Thread.sleep(2000);
		SDET.click(); */
		
		/* 3. Partial Link Text 
		If a long text is available and we want to use half or a portion of it. 
		In a link text we have to use the whole text but in partial link text we have to use a portion of the text
				
		WebElement Toys = driver.findElement(By.partialLinkText("Toys"));
		Toys.click(); 
		
		//4 . Name Locater*/
		
		//WebElement Search = driver.findElement(By.name("field-keywords"));
		//Search.sendKeys("Computer"); 
		
		//WebElement clickSearch = driver.findElement(By.id("nav-search-submit-button"));
		//clickSearch.click(); 
		
		/*5. Xpath - in Selenium is an XML path used for navigation throught HTML structure of the page.
		It is a syntax or language for finding any element on a webpage using XML path expression
		Xpath can be used for both HTML and XML documents to find the location of any element on a webpage using HTML DOM sturcture
		We have to types of Xpath 1. Absolute Xpath   2. Relative Xpath
		1. Absolute Xpath - It is the direct way to find the element, but the disadvantage of the
		absolute Xpath is that if there are any changes made in the path of the element then that Path gets failed. 
		Absolute Xpat starts with the single forward slash(/) 
		Example: 
	    WebElement Searchicon = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		Searchicon.click(); */
		
		
		/* 2. Relative Xpath
		Relative Xpath starts from the middle of HTML DOM structure. It starts with double forward (//). 
		It can search elements anywhere on the webpage, means no need to write a long xpath and you can
		start from the middle of HTML DOM structure. 
		Relative Xpathe is always preferred as it is not a complete path from the root element*/
		
		// 5. Class
		//WebElement Akbar = driver.findElement(By.className("nav-a  "));
		//Akbar.click();
		
		//Tags.
		
		
		
		
	}

}
