package day8;

public class Program2_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []age= {25,26,27,28,29};
		for(int i=0;i<=age.length-1;i++)
			System.out.print(age[i]+" ");
		
		System.out.println();
		
		int[]height=new int[5];
		height[0]=175;
		height[1]=168;
		height[2]=165;
		
		int size=0;
		
		for(int i=0;i<=height.length-1;i++) 
		{
			if(height[1]!=0)
				size++;
				System.out.print(height[i]+" ");
		}
		System.out.println("\nSIZE:"+size);
		

	}

}
