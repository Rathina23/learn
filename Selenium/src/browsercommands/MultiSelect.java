package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("//select[@class='form-control']"));
		Select oselect = new Select(ele);
		oselect.selectByIndex(1);
		oselect.selectByVisibleText("Monday");
		oselect.selectByValue("Tuesday");
		WebElement ele1 =driver.findElement(By.name("States"));
		Select oselect1 = new Select(ele1);
		oselect1.selectByIndex(1);
		oselect1.selectByVisibleText("Texas");
		oselect1.selectByValue("Ohio");
//		oselect1.deselectByIndex(1);
//		oselect1.deselectByVisibleText("Ohio");
//		oselect1.deselectByValue("Texas");
		oselect1.deselectAll();
		WebElement ele2 =driver.findElement(By.id("printAll"));
		ele2.click();
		
	}

}
