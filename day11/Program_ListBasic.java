package day11;
import java.util.ArrayList;
import java.util.*;
public class Program_ListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
	    arrayList.add(50);
	    System.out.println(arrayList);
	    ArrayList<Integer>arrayList2=new ArrayList<Integer>();
	    arrayList2.add(60);
	    arrayList2.add(70);
	    arrayList.addAll(arrayList2);
	    System.out.println(arrayList);
	    System.out.println("CONTAINS:"+arrayList.contains(100));
	    System.out.println("GET:"+arrayList.get(0));
	    System.out.println("SIZE:"+arrayList.size());
	    arrayList.remove(0);
	    System.out.println("REMOVE:"+arrayList);
	    System.out.println("INDEX of 70:"+arrayList.indexOf(70));
	    System.out.println("ITS EMPTY"+arrayList.isEmpty());
	    arrayList.set(0, 200);
	    System.out.println("UPDATE AT 0th:"+arrayList);
	    
	}
}
