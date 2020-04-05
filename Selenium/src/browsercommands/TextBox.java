package browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-message\"]"));
		Dimension dimension = element.getSize();
		System.out.println(dimension.height+"WIDTH" +dimension.width);
		element.sendKeys("Hi! This is Rathiutuber");
		Point point = element.getLocation();
		System.out.println(point.x+"j"+point.y);
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
	}
}
