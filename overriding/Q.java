class P 
{
	public static void main(String[] args) 
	{
		System.out.println("P-main");
	}

	static
	{
		System.out.println("P-SIB");
	}
}

class Q extends P
{
	public static void main(String[] args) 
	{
		System.out.println("Q-main");
	}
	
	static
	{
		System.out.println("Q-SIB");				//doesn't require main method of P
	}
}
													//main method can't be overrided as its static method