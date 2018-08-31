class J 
{
	static void test()
	{
		System.out.println("from J");
	}

	static
	{
		System.out.println("SIB-J");
	}
}

class K extends J
{
	static
	{
		System.out.println("SIB-K");
	}
}

class Manager5
{
	public static void main(String[] args) 
	{
		K.test();								//J.test();
	}
}

//calling super class static method with sub class name,compiler replaces from subclass name to super class name in .class file i.e K.test() to J.test()
//while running there is no K.test() it will be loaded into memory as K is not loaded it is not used while running.
//whichever classes are specified while running only those are loaded into memory & it is exected