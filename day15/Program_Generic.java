package day15;


class Demo2<T>
{
	void getData(T value)
	{
		System.out.println(value);
	}
}
public class Program_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2<String>obj1=new Demo2<String>();
		obj1.getData("hello");
		Demo2<Integer>obj2=new Demo2<Integer>();
		obj2.getData(10);
		Demo2<Boolean>obj3=new Demo2<Boolean>();
		obj3.getData(false);
		

	}

}
