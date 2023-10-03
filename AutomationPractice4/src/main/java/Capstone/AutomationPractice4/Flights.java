package Capstone.AutomationPractice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flights = driver.findElement(By.xpath("//span[@class='uitk-tab-text']"));
		flights.click();
		Thread.sleep(6000);
		WebElement departure = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		departure.click();
		Thread.sleep(6000);
		WebElement departdate = driver.findElement(By.xpath("//div[@aria-label='Thursday, October 26, 2023']"));
		departdate.click();
		
		

	}

}
