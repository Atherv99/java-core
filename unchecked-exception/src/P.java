class P 
{
	static void test1()
	throws ClassNotFoundException
	{
	  System.out.println("test begin1");
	  Class.forName("");
	  System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test1();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
