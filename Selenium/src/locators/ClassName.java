package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().window().maximize();
	driver.findElement(By.className("form-control")).sendKeys("Hi! This is Rathiutuber");
	
	
}
}