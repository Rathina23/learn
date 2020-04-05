package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverImplement
{
	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.navigate().to("http://www.google.com");   //instead of driver.get
				driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys("dogs",Keys.ENTER);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
				driver.navigate().refresh();
			}
}
