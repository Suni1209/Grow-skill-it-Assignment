package practice1.practice2;

public class String_ReverseWordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i love java";
		String []words=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			
			System.out.print(words[i]+" ");
		}
		

	}

}
