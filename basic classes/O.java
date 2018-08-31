	class N									//while running N class is only loaded into memeory
{
	static int i = 10;
	
	static
	{
		System.out.println("N-SIB");	//no main() method can't run N class but can compile successfully
	}
}

class O									//while running O class is only loaded into memeory then N class is loaded
{
	static
	{
		System.out.println("O-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("O-Main-begin");	
		System.out.println(N.i);				//N-SIB, 10, N class has to load into memory for the first time then i can be used,
												//all initializers will be executed
		System.out.println(N.i);				//10, already N is loaded st away use i
		System.out.println(N.i);				//10, already N is loaded st away use i,as long as execution is on loaded class will be available.
		System.out.println("O-Main-end");
	}
}

//both classes are non-public,file can be saved in any name.