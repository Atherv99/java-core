class H										//while running H only that class is loaded into memeory
{
	static
	{
		System.out.println("H-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("H-main");
	}
}

class I										//while running I class only that class is loaded into memeory
{
	static
	{
		System.out.println("I-SIB");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("I-main");
	}
}

//both classes non-public,file can be saved in any name.