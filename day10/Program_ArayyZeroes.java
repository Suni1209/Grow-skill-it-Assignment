package day10;

public class Program_ArayyZeroes {
	
	static void moveZeroes(int arr[])
	{
		int pos=0;//1
		for(int i=0;i<=arr.length-1;i++)
		{
			//i=2
			if(arr[i]!=0)
			{
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,3};
		moveZeroes(arr);
		for(int num:arr)
			System.out.print(num+" ");

	}

}
