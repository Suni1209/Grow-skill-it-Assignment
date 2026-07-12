package day14.part1;

import java.util.HashMap;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the day today is a very very very warm day";
		String[]words=str.split(" ");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(String word:words) 
		{
			if(map.containsKey(word)) 
			{
				int value=map.get(word);
				value++;
				map.put(word,value);
				}
			else
				map.put(word,2);
		}
		System.out.println(map);
		}

	}

