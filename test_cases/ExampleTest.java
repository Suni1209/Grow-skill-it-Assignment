package test_cases;

import org.testng.annotations.Test;

public class ExampleTest {

	@Test
	void login()
	{
		int num=10/10;
		System.out.println("Login");
	}
	@Test(dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("Logout");
	}
	@Test(enabled=false)
	void forgetPassword()
	{
		System.out.println("FOEGET PASSWORD");
	}
	@Test(timeOut=5000)
	void reload() throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("reload");
	}
}
