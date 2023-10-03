package Capstone.AutomationPractice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createnaccount = driver.findElement(By.linkText("Create new account"));
		createnaccount.click();
		Thread.sleep(3000);
		WebElement birthofmonth = driver.findElement(By.name("birthday_month"));
		Select ob = new Select(birthofmonth);
		ob.selectByIndex(6);
		Thread.sleep(3000);
		WebElement birthofday = driver.findElement(By.name("birthday_day"));
		Select ob1 = new Select(birthofday);
		ob1.selectByValue("25");
		Thread.sleep(3000);
		WebElement birthofyear = driver.findElement(By.name("birthday_year"));
		Select ob2 = new Select(birthofyear);
		ob2.selectByVisibleText("1998");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		

	}

}
