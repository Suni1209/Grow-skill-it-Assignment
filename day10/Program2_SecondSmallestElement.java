package day10;

public class Program2_SecondSmallestElement {

	public static void main(String[] args) {
		int[] arr= {1,100,4,3,1,1,7,2,9,1};
		//System.out.println("MAX VALUE AN INTEGER TAKE:"+Integer.MAX_VALUE);
		int smallest = Integer.MAX_VALUE;//100
		int secSmallest=Integer.MAX_VALUE;//100
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			if(arr[i]<smallest)//3<4
			
			{
				secSmallest=smallest;//secSmallest=3
				smallest=arr[i];//smallest=1
			}
			else if(arr[i]>smallest && arr[i]<secSmallest)
			{
				secSmallest=arr[i];
			}
		}
			System.out.println("smallest:"+smallest);
			System.out.println("secSmallest:"+secSmallest);
			//*for(int i=0;i<=arr.length-1;i++
		}
		

	}


