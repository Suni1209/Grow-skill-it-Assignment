package DoubtSession;

import java.util.Arrays;
import java.util.*;

public class Program9_SecSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,1,3,4};
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
		
		System.out.println("MAX VALUE AN INTEGER TAKE:"+Integer.MAX_VALUE);
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


