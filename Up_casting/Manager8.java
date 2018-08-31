class Manager8 
{
	static void test(A a1)//test method argu is A type, while calling test method you can supply B,C,D type
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		test(new B());
		test(new C());//C type automatically upcasted to B type 
		test(new D());//D type automatically upcasted to C type 
		B b1 = new B();
		test(b1);
		D d1 = new D();
		test(d1);
		System.out.println("done");
	}
}
