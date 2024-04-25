package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class readdatafromexcelsingledocumentcellvalue {
	@Test
	public void run() throws Throwable{
	utilityclass uc=new utilityclass();
	WebDriver driver=new ChromeDriver();
	String url = uc.readthedatafromexcelcellsinglevaue("./file.xlsx","Sheet1",0,0);
	String un = uc.readthedatafromexcelcellsinglevaue("./file.xlsx","Sheet1",0,1);
	driver.get(url);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(un);
	
	}
	
}
