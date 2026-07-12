package day15;
class MyThreadC extends Thread
{
	volatile int num=10;
	@Override
	public void run() {
		System.out.println("Bye");
	}
	
}
public class Program_Join {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		MyThreadC t1=new MyThreadC();
		t1.start();
		// main should wait t1 to complete
		//t1.join();
		System.out.println("Thank you");

	}

}
