package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
		 public static void main(String[] args) 
		 {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/Automation-practice-form/");
		 driver.findElement(By.name("firstname")).sendKeys("Lakshay"); 
		 driver.findElement(By.name("lastname")).sendKeys("Sharma");
		 driver.findElement(By.id("submit")).click();
		 }

}
