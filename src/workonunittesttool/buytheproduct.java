package workonunittesttool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class buytheproduct {
	@Test(priority =1 )
	public void registration() {
		System.out.println("user able to registar");
		//Reporter.log("user able to register");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("user able to login");
	} 
	@Test(priority = -2)
	public void search() {
		System.out.println("user able to search");
	}
	@Test(priority = 0)
	public void selectproduct() {
		System.out.println("user able to selectproduct");
	}
	@Test(enabled = true)
	public void payment() {
		System.out.println("user abel to make payment");
	}

}
