package practice1.practice2;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		
		
		for(int i=3;i<=n;i++) {
			int c=a+b;
		
		System.out.print(c+" ");
	a=b;
	b=c;
		}
	}

}
