package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabled
{
	public static void main (String [] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
//		Boolean Display = driver.findElement(By.xpath("//*[@id ='identifierId']")).isDisplayed();
//		System.out.println("Element displayed is :"+Display);
//		Boolean Enable = driver.findElement(By.xpath("//*[@id ='identifierId']")).isEnabled();
//		System.out.println("Element enabled is :"+Enable);
//		driver.findElement(By.xpath("//*[@id ='identifierId']")).sendKeys("<put_an_email_id>");
//		driver.findElement(By.xpath("//*[@id='next']")).click();
		Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
		System.out.println("Element selected is :"+Select);
		
	} 
	
}


