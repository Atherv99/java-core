class Manager19 
{
	static void test(B b1)
	{
		System.out.println("from test(B)");
	}
	public static void main(String[] args) 
	{
		A a1 = new B();   //auto upcasting
		test((B)a1);    //from test(B). Explicit downcasting is done,test() argu is B type & the same is supplied to test()
		System.out.println("Hello World!");//Hello World!
	}
}
