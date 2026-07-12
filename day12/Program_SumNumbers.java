package day12;

public class Program_SumNumbers {

	public static void main(String[] args) {
		String str="ABCD123E5";
		String temp="0";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(Character.isDigit(str.charAt(i))) 
			{
				temp=temp+str.charAt(i);
			}
			else
			{
				int num=Integer.parseInt(temp);
				sum=sum+num;//123
				temp="0";//0
			}
		}
		System.out.println(sum+Integer.parseInt(temp));

	}

}
