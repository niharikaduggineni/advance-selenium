package workonunittesttool;

import org.testng.annotations.Test;

public class workingondependsonmethod {
	@Test
	public void registration() {
		System.out.println("user able to registar");
		//Reporter.log("user able to register");
	}
	@Test(dependsOnGroups ={"registration","Payment"})
	public void login() {
		System.out.println("user able to login");
	} 
	@Test
	public void search() {
		System.out.println("user able to search");
	}
	@Test
	public void selectproduct() {
		System.out.println("user able to selectproduct");
	}
	@Test
	public void Payment() {
		System.out.println("user abel to make payment");
	}


}
