package Capstone.AutomationPractice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement searchfield = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		//searchfield.sendKeys("Comupter");
		WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		emailfield.sendKeys("protrainingtec.com");
		Thread.sleep(3000);
		WebElement passwordfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordfield.sendKeys("abcdxyz");
		Thread.sleep(3000);
		WebElement loginfield = driver.findElement(By.xpath("//button[@type='submit']"));
		loginfield.click();
		Thread.sleep(3000);
		WebElement forgotpw = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		forgotpw.click();
		

	}

}
