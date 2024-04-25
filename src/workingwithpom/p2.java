package workingwithpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class p2 extends baseclass{
@Test
public void search() throws InterruptedException {
	WebElement searchaction = driver.findElement(By.id("small-searchterms"));
	searchaction.sendKeys("books");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	searchaction.sendKeys("computer");
	Thread.sleep(2000);
	driver.findElement(By.xpath( "//input[@value=\"Search\"]")).click();
	Thread.sleep(2000);
}
}
