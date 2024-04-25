package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bagepage {
public  bagepage(WebDriver driver){
	PageFactory.initElements( driver,this);
}
@FindBy (id="small-searchterms")
private WebElement searchbar;

@FindBy(xpath = "//input[@value=\"Search\"]")
private WebElement searchbox;

public WebElement getSearchbar() {
	return searchbar;
}

public WebElement getSearchbox() {
	return searchbox;
}

}
