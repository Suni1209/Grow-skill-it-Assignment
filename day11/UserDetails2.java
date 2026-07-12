package day11;

public class UserDetails2 {

	public static void main(String[] args) {
		
		UserDetails user=new UserDetails();
		user.UserId=101;
		user.name="Rajat";
		UserDetails.Address address=user.new Address();
		address.City="Pune";
		address.state="MH";
		address.Country="IN";
		
		System.out.println(user.name+ ":" +address.City);

	}

}
