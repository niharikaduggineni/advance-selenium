package workonunittesttool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class worksoninvcationandtimepool {

	@Test(invocationCount  =2, threadPoolSize   = 2)
public void run(){
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//driver.quit();
	}
}
