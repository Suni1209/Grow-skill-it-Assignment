package day14;
import java.util.*;
public class Program_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		ListIterator<Integer>it=list.listIterator();
		Iterator<Integer>it2=list.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.print(it.previous()+" ");
		System.out.print(it.previous()+" ");
		
		List list2=new ArrayList();
		list2.add("hello");
		list2.add(20);
		list2.add(30.0F);
		System.out.println();
		for(Object data:list2) 
		{
			System.out.print(data+" ");
		}
		

	}

}
