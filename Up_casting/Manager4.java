class Manager4 
{
	static void test1(A a1)//calling test1 supply A type, no conversion required.
	{
		System.out.println("test1(A)");
	}
	static void test2(C c1)//calling test2 supply C type, no conversion required
	{
		System.out.println("test2(C)");
	}
	static D test3()
	{
		D d1 = new D();
		return d1;//return type is D, assign to D type
	}
	static B test4()
	{
		return new B();//returning B
	}

	public static void main(String[] args) 
	{
		test1(new A());
		C c1 = new C();
		test2(c1);
		D d1 = test3();
		B b1 = test4();
		System.out.println("done");
	}
}
