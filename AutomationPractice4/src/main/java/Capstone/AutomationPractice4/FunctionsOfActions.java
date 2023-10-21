package Capstone.AutomationPractice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionsOfActions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\git\\repository8\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);//create object for actions class.
		action.moveToElement(Sign).build().perform();
		Thread.sleep(3000);
		WebElement watchlist = driver.findElement(By.xpath("//*[text()='Watchlist']"));
		action.moveToElement(watchlist).click().build().perform();
		

	}

}
