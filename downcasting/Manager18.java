class Manager18 
{
	static void test(B b1)//test1 arg is B type but suppling A type.
	{
		System.out.println("from test1(B)");
	}

	public static void main(String[] args) 
	{
		A a1 = new B();//auto upcasting
		test((B)a1);			//CTE, supplying A type in place of B type, 
		//explicity downcaste is required but its not done hence CTE
		System.out.println("done");
	}
}
//test1() method requires B type but A type is supplied.