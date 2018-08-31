class X 
{
	static									//SIB definition block
	{
		static int i = 10;					//compile time error
		int j = 10;
		System.out.println("Hello World!");
	}
}

//static keyword cannot be used in SIB(definition block) 