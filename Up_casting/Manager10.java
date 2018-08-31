class Manager10 
{
	static C test()//test method is C type returns D type. D type is automatically upcasted to C type
	{
		D d1 = new D();
		return d1;
	}

	public static void main(String[] args) 
	{
		A a1 = test();// C type is automatically upcasted to A type
		System.out.println("done");
	}
}
