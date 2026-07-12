package day13;

public class Program4_WordsInString {

	public static void main(String[] args) {
		String str="today is a warm day";
		int sp=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(str.charAt(i)== ' ')
				sp++;
		}
		System.out.println("Words:"+(sp+1));
		
		String[]words=str.split( " ");
		System.out.println("Words:"+words.length);
		//{"today","is","a","warm","day"}
		

	}

}
