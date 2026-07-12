package assignment_Practice;

public class Count_Consonants {

	public static void main(String[] args) {
		
		String str="Hello World";
		int consonants=0;
		str=str.toLowerCase();
		for (int i=0;i<str.length();i++) 
		{	char ch =str.charAt(i);
			
			
			if(ch>='a' && ch<='z'&&
					ch!='a'&& ch!='e'&& ch!='i'&&
					ch!='o' && ch!='u')
					
			{			
		 consonants ++;
		}
	}
		System.out.println("Consonants:"+consonants);

	}

}
