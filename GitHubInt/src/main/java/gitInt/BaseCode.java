package gitInt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseCode {
	public WebDriver driver;

public WebDriver initdriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gnani\\eclipse-workspace\\GitHubInt\\src\\test\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demoqa.com/registration/");
	return driver;
}

}
