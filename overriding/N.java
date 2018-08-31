class N 
{
	public static void main(String[] args) 
	{
		System.out.println("from N");
	}

	static
	{
		System.out.println("SIB-N");
	}
}

class O extends N									//though there is no main method the ctrl will go to superclass.
{													//before O is loaded it chks if main method is or not as its not there goes to superclass then superclass is loaded then subclass is loaded.
	static
	{
		System.out.println("SIB-O");
	}
}