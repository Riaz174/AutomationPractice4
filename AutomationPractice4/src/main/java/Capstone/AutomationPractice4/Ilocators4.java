package Capstone.AutomationPractice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators4 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		WebElement customerservice = driver.findElement(By.linkText("Customer Service"));
		customerservice.click();
		Thread.sleep(3000);
		WebElement giftcard = driver.findElement(By.linkText("Gift Cards"));
		giftcard.click();
		Thread.sleep(3000);
		WebElement todaysdeals = driver.findElement(By.partialLinkText("Today's "));
		todaysdeals.click();
		Thread.sleep(3000);
		WebElement fieldofsearch = driver.findElement(By.name("field-keywords"));
		fieldofsearch.sendKeys("Computer");
		

	}

}
