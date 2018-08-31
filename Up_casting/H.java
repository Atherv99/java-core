class H											//3 conversions
{
	static int test(short s)					//byte into short then short into int
	{
		return s;								//return type is int
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		double d = test(b);						//int into double
		System.out.println(d);
	}
}