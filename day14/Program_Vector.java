package day14;

public class Program_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[[]]]";
		int flag=0;
		Stack<Character>st=new Stack<Character>();
		for(inti=0;i<=str.length()-1;i++)
		{ 
			if(str.charAt(i)=='[')
				st.push(str.charAt(i));
			else
			{
				if(st.empty())
				{
					flag=1;
					break;
				}
				else 
				{
					st.pop();
				}
			}
		}
		if(flag==1)
			System.out.println("Not balanced:More closing");
		else if(!st.isEmpty())
			System.out.println("Not balanced:More Opening");
		else 
		{
			System.out.println("Balanced");
		}
		

	}

}
