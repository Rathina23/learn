package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamenameUsingIndex {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("Hi! This is Rathiutuber");
		//Refer TextBox class for above lines
		driver.findElement(By.xpath("(//*[@class ='btn btn-default'] )[1]")).click();
	}
}
