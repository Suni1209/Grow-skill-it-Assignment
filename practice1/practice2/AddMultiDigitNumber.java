package practice1.practice2;

public class AddMultiDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc12xyz34";
		int sum=0;
		int num=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				num=num*10+(ch-'0');
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println("sum ="+ sum);
				
				
			
			}
				
			
		}
		
		


