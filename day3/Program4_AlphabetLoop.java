package day3;

public class Program4_AlphabetLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char bigAlpha='A';
		char smallAlpha='a';
        while(bigAlpha<='Z') 
        {
        	System.out.println(bigAlpha+ ""+smallAlpha);
        	bigAlpha++;
        	smallAlpha++;
        }
	}

}
