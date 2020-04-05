package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static void main(String[] args) throws Exception
	{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			//driver.close();
	}
}
