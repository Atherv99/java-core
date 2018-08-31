class Manager20 
{
	static C test()//test method return type is C but returning A type.
	{
		A a1 = new D();
		return a1;//CTE, explicit down caste is required
	}

	public static void main(String[] args) 
	{
		D d1 = test();//CTE, C type should be downcasted to D type explicitly
		System.out.println("done");
	}
}
