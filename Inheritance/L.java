class L
{
	L()
	{
		super();
	System.out.println("L()");
	this(10);  
	
	/* htis should not be here this should be the first statement 
	and we can not both the statement as super ot this() will be only one among one. */

	}

	L(int i)     
	{
		super();
		System.out.println("K()");
		   


	}


	public static void main(String[] args) 
	{
				System.out.println("done");

		
	}
}


