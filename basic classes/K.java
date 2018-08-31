class J										//while running K class is only loaded into memeory
{
	static
	{
		System.out.println("J-SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("J-main");
	}
	
	static
	{
		System.out.println("J-SIB2");
	}
}

class K										//while running K class is only loaded into memeory
{
	static
	{
		System.out.println("K-SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("K-main");
	}
	
	static
	{
		System.out.println("K-SIB2");
	}
}

//both classes are non-public,file can be saved in any name.