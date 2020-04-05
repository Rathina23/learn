package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverImplement {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com/");			
	}
}
