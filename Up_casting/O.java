class O 
{
	static int test1()					//test1 return type is int before returning converting into byte
	{
		byte b = 10;
		return b;						//implicity
	}

	static int test2()					//test2 return type is int,before returning it is explicitly converting from int to byte & then return byte.
	{
		byte b = 10;
		return (int)b;
	}

	public static void main(String[] args) 
	{
		double d1 = test1();			//implicit here it is not giving anythid in method
		double d2 = (double) test2();	//explicit
		System.out.println("done");
	}
}