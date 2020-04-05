package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();	
		driver.findElement(By.name("first_name")).sendKeys("Rathi");
		driver.findElement(By.name("last_name")).sendKeys("Utuber");;
		driver.findElement(By.xpath("//*[@id='contact_form']/fieldset/div[3]/div/div/input")).sendKeys("rathiutuber@gmail.com");
		
		}
}
