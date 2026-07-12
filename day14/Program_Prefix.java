package day14;

public class Program_Prefix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longest="";
		String current="";
		String[]names= {"ramohan","ram","ramu",};
		int index=0;
		int flag=0;
		String name=names[0];
		while(index<name.length()) {
			current=current+name.charAt(index);
			for(int i=1;i<=names.length-1;i++) 
			{
				String userName=names[i];
				if(userName.startsWith(current))
				{	
				}
				else
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				longest=current;
			index++;
		}
		if(longest.isEmpty())
			System.out.println("No Prefix");
		else
			System.out.println(longest);
		
			
		}
		


	}


