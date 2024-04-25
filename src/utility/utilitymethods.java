package utility;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class utilitymethods {
static WebDriver driver;
public String gettilte() {
	String title = driver.getTitle();
	return title;
	}

	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
}
	public void selectbyindex(WebElement selectElement,int index) {
		Select sel = new Select(selectElement);
		sel.selectByIndex(index);
	}
	public void selectbyvalue(WebElement selectElement,String value) {
		Select sel = new Select(selectElement);
		sel.selectByValue(value);
	}
	public void asser(String actual,String expected) {
		SoftAssert soft = new SoftAssert();
		assertEquals(actual,expected);
	}
	public static void softassert() {
		SoftAssert soft = new SoftAssert();
		soft.assertAll();
	}
	public void action() {
		
	}
}
