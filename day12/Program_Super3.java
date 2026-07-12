package day12;
class Exam1
{
	int examCode;
	String examName;
	Exam1(int examCode,String examName)
	{
		this.examCode=examCode;
		this.examName=examName;
		System.out.println("Parent constructor called");
	}
}
class BtechExam extends Exam1
{
	
	 String branchName;
	void print()
	{
		System.out.println(super.examCode+":"+super.examName+":"+this.branchName);
	}
	BtechExam(int examCode,String examName,String branchName)
	{
		super(examCode,examName);
		this.branchName=branchName;
		System.out.println("Child constructor called");
	}
}

public class Program_Super3 {

	public static void main(String[] args) {
		BtechExam btech=new BtechExam(101,"Programming C","CSE");
		btech.print();
		

	}

}
