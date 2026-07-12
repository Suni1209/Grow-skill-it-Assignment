package assignment_Practice;

public class Program_TitleCase {

	public static void main(String[] args) {
		String str="java programming language";
		String result="";
		
		String[]words=str.split("");
		for(int i=0;i<str.length();i++)
		{
			String word=words[i];
			
			String first=word.substring(0,1).toUpperCase();
			String rest=word.substring(1).toLowerCase();
			
			result=result+first+rest+ " ";
		}
        System.out.println(result.trim());
	}

}
