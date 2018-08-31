class Manager11 
{
	static A test1(C c1)//test1 method is A type argu C,test1 require C type we are supplying D type.
	{
		return test2(c1);
	}

	static B test2(C c1)//C type can be upcasted to B type.
	{
		return c1;//test2 method type is B type.
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		Object o1 = test1(d1);
		System.out.println("done");
	}
}
