package test_cases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTest {
	@Test(dataProvider="getCred")
	void signIn(String username,String pass)
	{
		System.out.println(username+":"+pass);
	}
	@DataProvider
	Object[][]getCred()
	{
		Object[][] Cred=new Object[3][2];
		Cred[0][0]="user1";
		Cred[0][0]="user1";
		Cred[0][1]="pass1";
		Cred[1][0]="user2";
		Cred[1][1]="pass2";
		Cred[2][0]="user3";
		Cred[2][1]="pass3";
		return Cred;
	}
	@Parameters({"url"})
	@Test
	void signOut(String qaUrl)
	{
		System.out.println(qaUrl);
		
	}
	
}
