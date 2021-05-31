package testNg;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeSuite
	public void BS() {
		Reporter.log("Beforesuite",true);
	}
	
	@AfterSuite
	public void AS() {
		Reporter.log("Aftersuite",true);
	}
	
	@BeforeClass
	public void BC() {
		Reporter.log("Beforeclass",true);
	}
	
	@AfterClass
	public void AC() {
		Reporter.log("Afterclass",true);
	}
	
	@BeforeMethod
	public void BM() {
		Reporter.log("BeforeMethod",true);
	}

	@AfterMethod
	public void AM() {
		Reporter.log("AfterMethod",true);
	}
	
	
	
	@BeforeTest
	public void BT() {
		Reporter.log("BeforeTest",true);
	}
	
	@AfterTest
	public void AT() {
		Reporter.log("AfterTest",true);
	}
	
	@Test
	public void test1() {
Reporter.log("Test",true);
	}

}
