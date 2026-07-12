package day12;
public  class TestAccess {
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	void print()
	{
		System.out.println(this.protectedNum);
	}
	
}
class TestAccess2 extends TestAccess
{
void print()
{
	System.out.println(this.);
}

}
