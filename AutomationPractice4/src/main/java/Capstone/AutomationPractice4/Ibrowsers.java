package Capstone.AutomationPractice4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	static WebDriver driver; //WebDriver is Interface and driver is reference variable

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set the browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice4\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //Calling the driver by defining the ChromeDriver class constructor
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String windowOfHandle = driver.getWindowHandle();
		System.out.println(windowOfHandle);
		Thread.sleep(6000);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
	}

}
