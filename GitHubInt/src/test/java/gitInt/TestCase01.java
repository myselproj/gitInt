package gitInt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase01 extends BaseCode{
	public WebDriver driver;
	
	public TestCase01() {
		this.driver = driver;
	}
	
	@Test
	public void TC01() {
		driver = initdriver();
		driver.findElement(By.id("name_3_firstname")).sendKeys("User Data FName");
		driver.findElement(By.id("name_3_lastname")).sendKeys("User Data LName");

		driver.findElement(By.xpath("//*[@value='married']")).click();
		driver.findElement(By.xpath("//*[@value='cricket ']")).click();

		driver.findElement(By.name("pie_submit")).click();
		driver.close();
	}

}
