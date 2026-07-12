package day11;
class ExamA
{
	int examCodeA=101;	
}
class ExamB extends ExamA
{
	
	}
class TestP
{
	final void hello()
	{
		System.out.println("Hello");
	}
	
}
class TestQ extends TestP
{
	void hello()
	{
		System.out.println("Bye");
	}
}
public class Program1_Final{
	
	public static void main (String[] args) {
		ExamA exam=new ExamA();
		//exam.examCode=102;
		System.out.println(exam.examCodeA);
		TestQ obj=new TestQ();
		obj.hello();
	}
	
}
