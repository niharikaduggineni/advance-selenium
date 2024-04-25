package workingwithpom;

import org.testng.annotations.Test;

public class p1 extends baseclass {
@Test
public void click() throws InterruptedException {
	bagepage page=new bagepage(driver);
	page.getSearchbar().sendKeys("books");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	page.getSearchbar().sendKeys("computer");
	Thread.sleep(2000);
	page.getSearchbox().click();
}
}
