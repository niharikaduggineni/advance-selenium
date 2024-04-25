package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readmultipuldata {
	@Test(dataProvider = "login")
	public void run(String uname,String psw) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	utilityclass uc=new utilityclass();
	String url = uc.redthedatefrompropfile("./ddt.properties.txt", "url");
	driver.get(url);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(uname);
	driver.findElement(By.id("Password")).sendKeys(psw);
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	@DataProvider(name="login")
	public String[][]datasupply() throws Throwable{
		return utilityclass.registrationdata("./textdata/logindata.xlsx", "Sheet1");
		
	}
}
