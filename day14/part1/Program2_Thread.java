package day14.part1;

class MyThreadB implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());	
	}
}
public class Program2_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			MyThreadB obj=new MyThreadB();
			Thread t1=new Thread(obj);
			t1.start();
			
		}

	}

}
