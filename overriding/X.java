class W
{
	void test()
	{
		System.out.println("from W");
	}
}
class  X extends W
{
	void test(int i)
	{
		System.out.println("from x");
	}
	public static void main(String[] args) 
	{
		X obj = new X();
		obj.test();    //this will check for test() method with to that method which have no argument by default
	}
}
