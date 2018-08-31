class I 
{
	static float test1(int i)
	{
		return test2(i);
	}
	
	static long test2(int i)					//test2 int into long
	{
		return i;								//test2 return type long but test1 suppose to return float
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		double d = test1(b);
		System.out.println("done");
	}
}