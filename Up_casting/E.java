class E 
{
	static void test(double d)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		int i = 100;
		test(i);							  // test(double i);  i goes to double
		System.out.println("done");
	}
}

//int can be automatically converted int double