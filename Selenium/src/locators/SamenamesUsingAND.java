package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamenamesUsingAND {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			WebElement button = driver.findElement(By.xpath("//*[@value='RoundTrip' and @name='ctl00$mainContent$rbtnl_Trip']"));
			button.click();
			System.out.println(button.isSelected());
		}

	}


