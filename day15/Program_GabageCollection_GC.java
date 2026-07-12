package day15;


public class Program_GabageCollection_GC {
	

	int num;

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("GC IS CALLED");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_GabageCollection_GC obj1=new Program_GabageCollection_GC();
		obj1.num=10;
		Program_GabageCollection_GC obj2=obj1;
		//obj1-------->NULL
		//ONJ2-------->SPACE
	
	
		
		obj1=null;
		System.out.println(obj2.num);
		//VIA OBJ2 I CAN STILL ACCESS SPACE
		obj2=null;
		System.gc();
		
	}

}
