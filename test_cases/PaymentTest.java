package test_cases;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class PaymentTest {
	
	@Test
	void paid()
	{
		try {
			int num=10/0;
		System.out.println("PAID");
		}catch(Exception ex)
		{
			
		}
	}
	@Test(groups= {"smoke"})
	void unpaid()
	{
		boolean value=false;
		//String data="hello";
		//Assert.assertTrue(false);
		SoftAssert soft =new SoftAssert();
		soft.assertTrue(value);
		//Assert.assertEquals("hello",data);
		System.out.println("UNPAID");
		soft.assertAll();
	}
	

	
		

	}
