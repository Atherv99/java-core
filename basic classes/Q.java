class P									//while running P class is only loaded into memeory ONE Time available as long as its executing.
{
	static
	{
		System.out.println("P-SIB");
	}

	static void test1()
	{
		System.out.println("from test1");
	}
}

class Q
{
	public static void main(String[] args) 
	{
		System.out.println("------------");
		P.test1();							//P is loaded into memory(called multiple time) then call test() method & print from test1
		P.test1();							//print test1
		P.test1();							//print test1
		System.out.println("------------");
	}

	static
	{
		System.out.println("Q-SIB");
	}
}