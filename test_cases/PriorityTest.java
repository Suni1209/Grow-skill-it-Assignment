package test_cases;

import org.testng.annotations.*;

public class PriorityTest {
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("BEFORE SUITE");
	}
	@AfterSuite
	void afterSuite()
	{
		System.out.println("AFTER SUITE");
	}
	@BeforeTest
	void beforeTest()
	{
		System.out.println("BEFORE TEST");
	}
	@AfterTest
	void afterTest()
	{
		System.out.println("AFTER TEST");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("BEFORE CLASS");
	}
	@AfterClass
	void afterClass()
	{
		System.out.println("AFTER CLASS");
	}@BeforeMethod
	void beforeMethod()
	{
		System.out.println("BEFORE Method");
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("AFTER Method");
	}
	
	@Test//(priority=0)
	void MethodC()
	{
		System.out.println("MethodC");
	}
	@Test(groups= {"smoke"},priority=2)
	void MethodA()
	{
		System.out.println("MethodA");
	}
	@Test//(priority=3)
	void MethodB()
	{
		System.out.println("MethodB");
	}
}
