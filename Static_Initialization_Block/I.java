class I
	{
	
	static int i=test();  // here control is going to test().then on previous
	static
	{
	
	   System.out.println("SIB1");
	 
	}
	
	static int test()
	{
	
	   System.out.println("test");
	   return 10;
	}

	public static void main(String[] args)

	{
	 System.out.println("done");
	 System.out.println(i);
	 
	}
	static 
	{
	
	
	  System.out.println("SIB2");
	}

	}