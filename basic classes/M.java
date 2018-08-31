class L											//while running L class is only loaded into memeory
{
	static
	{
		System.out.println("SIB-L");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("L-main");
	}
}

class M											//while running M class is only loaded into memeory,then N class is loaded
{
	static
	{
		System.out.println("SIB-M");
	}

	public static void main(String[] args)		//args is local to current method 
	{
		System.out.println("M-main-begin");
		L.main(args);							//M class main() method is calling L class main() method, here now L class is loaded into memory, SIB-L is printed.
												//L main() is executed first time in M class so L-main
												//args is String[] array else can be null
		System.out.println("M-main-end");
	}
}

//both classes are non-public,file can be saved in any name.