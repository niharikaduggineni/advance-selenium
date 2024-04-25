package workonunittesttool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class worksonchronological {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("it is BeforeSuite");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("it is AfterSuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("it is beforetest");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("it is Aftertest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("it is beforeclass");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("it is Afterclass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("it is beforemethod");
	}
@AfterMethod
public void Aftergropu() {
	System.out.println("it is Aftermethod");
}
@Test
public void test() {
	System.out.println("it is test");
}
@Test
public void test1() {
	System.out.println("it is test1");
}




}
