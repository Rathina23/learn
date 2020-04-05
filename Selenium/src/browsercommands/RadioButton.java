package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	WebElement button = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
	button.click();
	System.out.println(button.isSelected());
	button.clear();
	System.out.println(button.isSelected());
	}
}
