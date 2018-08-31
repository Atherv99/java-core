class R 
{
	static void test(int i)
	{
		System.out.println("test : " + i);
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		double d1 = 10.8;
		
		test(b);
		test((int)d1);								//test: 10 - explicity converstion
		System.out.println("done");
	}
}

//test method require int type, byte is possbile to int but double is not possible by compiler,it should be done by user.