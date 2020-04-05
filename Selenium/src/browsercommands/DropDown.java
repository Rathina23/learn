package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")	;
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,300)");
		WebElement month_dropdown = driver.findElement(By.id("day"));
		Select oSelect = new Select(month_dropdown);
		oSelect.selectByIndex(3);
		Thread.sleep(3000);
		WebElement year_yy = driver.findElement(By.id("year"));
		Select year_y = new Select(year_yy);
		year_y.selectByValue("2000");
		Thread.sleep(3000);
		WebElement month_m = driver.findElement(By.id("month"));
		Select month_d1 = new Select(month_m);
		month_d1.selectByVisibleText("Jul");
		//driver.quit();
		 
		}
		 
		
	}


