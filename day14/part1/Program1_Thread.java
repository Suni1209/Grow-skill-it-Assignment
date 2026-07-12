package day14.part1;

class MyThreadA extends Thread
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
		
	}
	
}

public class Program1_Thread {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) 
		{
		MyThreadA obj=new MyThreadA();
		obj.start();
		}

	
	}
}

