package workonunittesttool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class workingwithcrossbroswer {
	WebDriver driver;
	@Parameters({"browsername","url"})
@Test
public void broswetest(@Optional("chrom") String browsername,@Optional("https://www.facebook.com/")String  url) throws Throwable {
	if(browsername.equals("chrom")) {
		driver=new ChromeDriver();
	}
	else if (browsername.equals("edge")) {
		driver=new EdgeDriver();
	}else {
		System.out.println("user not abl able to open");
	}
driver.manage().window().maximize();
driver.get(url);
Thread.sleep(2000);
driver.quit();
}
}