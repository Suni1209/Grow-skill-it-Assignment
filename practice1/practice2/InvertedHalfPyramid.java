package practice1.practice2;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");			
			}
			System.out.println();
		}

	}

}
