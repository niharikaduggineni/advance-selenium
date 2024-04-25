package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readdatafromrow {

	@Test
	public void run() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		utilityclass uc=new utilityclass();
		String[] logindata = uc.readthedatafromsinglerow("./textdata/row.xlsx","Sheet1", 0);
		driver.get(uc.redthedatefrompropfile("./ddt.properties.txt", "url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(logindata[1]);
		driver.findElement(By.id("Password")).sendKeys(logindata[2]);
	}
}
