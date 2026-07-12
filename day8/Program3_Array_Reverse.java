package day8;

public class Program3_Array_Reverse {
	static void reverse(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	
	

	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		reverse(arr);
				
		}
		
		

	}


