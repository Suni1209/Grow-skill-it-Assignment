package DoubtSession;

public class Program4_ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,originalnum =num,cubesum=0;
		while(num>0) {
			int lastDigit = num%10;
			cubesum =cubesum +(lastDigit*lastDigit*lastDigit);
			num=num/10;
		}
		if(cubesum== originalnum) {
			System.out.println( originalnum + "is Armstrong number");
				
		}
		else {	
			System.out.println(originalnum + "is not Armstrong number");
		}
	}

}
