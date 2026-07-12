package practice1.practice2;

public class FullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");	
					
			}
			System.out.println();
		}
		

	}

}
