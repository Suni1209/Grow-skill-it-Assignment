package day14.part1;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbc";
		char[]letters=str.toCharArray();
		HashMap<Charater,Integer>map=new LinkedHashMap<Character,Integer>();
		String newString="";
		for(char alpha:letters) 
		{
			if (map.containsKey(alpha))
			{
				int value=map.get(alpha);
				value++;
				map.put(alpha,value);
			}
			else
				map.put(alpha,1);
		}
		System.out.println(map);
		for(Entry<Character,Integer>entry:map.entrySet()) 
		{
			newString=newString+entry.getkey()+entry.getValue();
		}

	}

}
