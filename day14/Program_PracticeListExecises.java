package day14;

import java.util.*;

class Test9
{
	int testId;
	String testName;
	public Test9(int testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
}
	
public class Program_PracticeListExecises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numList[]= {10,20,30,40,50};
		System.out.println(numList);
		
		for(int num:numList) 
		{
			System.out.print(num+" ");
		}
		List<Integer>numList2=new ArrayList<Integer>();
		numList2.add(10);numList2.add(20);numList2.add(30);
		System.out.println("\n"+numList2);
		
		
		
		
		
		System.out.println();
		
		
		
		
		String dataList[]= {"hello","how","are","your"};
		for(String data:dataList) 
			
		{
			System.out.print(data+" ");
		}
		
		
		Test9 obj1=new Test9(10,"EngliShTest");
		Test9 obj2=new Test9(20,"MathsTest");
		List<Test9>list=new ArrayList<Test9>();
		list.add(obj1);list.add(obj2);
		System.out.println(list);
		
		for(Test9 t:list)
		{
			System.out.println(t.testId+":"+t.testName);
		}
	}

}
