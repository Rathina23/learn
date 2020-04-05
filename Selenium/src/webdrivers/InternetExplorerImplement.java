package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerImplement
{
	public static void main(String arg[])
		{
			System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.navigate().to("www.facebook.com");			
		}
}
