package day11;

public class Program_CountDigit {

	public static void main(String[] args) {
		String str="ABCD123E5";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(Character.isDigit(str.charAt(i)))
			{
				int num=Integer.parseInt(str.charAt(i)+"");
				sum=sum+num;
			}
			else
			{
				
			}
		}
			System.out.println(sum);
		}
		

	}


