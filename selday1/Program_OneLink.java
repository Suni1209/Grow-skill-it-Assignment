package selday1;

import java.net.HttpURLConnection;
import java.net.URL;

public class Program_OneLink {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		HttpURLConnection conn=(HttpURLConnection)
				new URL("https://www.tutorialspoint.com/compilerhjhjhjs/index.htm")
				.openConnection();
		conn.setRequestMethod("GET");
		System.out.println(conn.getResponseCode());
		if(conn.getResponseCode()==404)
			System.out.println("link is not working");
		else
			System.out.println("link is working");

	}

}
