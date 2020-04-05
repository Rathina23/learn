package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")	;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		String tagName = element.getTagName(); 
		//String linkText = element.getText();
		//System.out.println(linkText);
		System.out.println(tagName);
}
}