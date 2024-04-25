package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readthedatafrompro {
@Test
public void demoweb() throws Throwable {
	WebDriver driver=new ChromeDriver();
	utilityclass uc=new utilityclass();
	String url = uc.redthedatefrompropfile("./url.properties.txt", "url");
driver.get(url);
}
}
