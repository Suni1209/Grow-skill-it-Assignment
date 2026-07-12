package day14.part1;
import java.util.*;
import java.util.Map.Entry;

public class Program_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(30,"D");
		map.put(1,"AA");
		map.put(10,"B");
		map.put(2,"C");
		map.put(49,"E");
		map.put(5,"F");
		map.put(6,"G");
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(99));
		map.remove(1);
		
		for(Entry<Integer,String>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
