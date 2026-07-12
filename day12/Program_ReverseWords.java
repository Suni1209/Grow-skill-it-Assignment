package day12;

public class Program_ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="today is a warm day";
		StringBuilder reverse=new StringBuilder();
		String[]words=str.split(" ");
		for (String word:words) 
		{
			StringBuilder sb=new StringBuilder(word);
			reverse=reverse.append(" ").append(sb.reverse());
		}
		String reverseResult=reverse.toString().trim();
		System.out.println(reverseResult);
		

	}

}
