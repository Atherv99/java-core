interface H
{
	void test1();
	void test2();
}

class I
{
	public void test1()
	{
		System.out.println("from test1");
	}
}

class  J extends I implements H //if we dont extends I then we need to create method test1() to j
{
	public void test2()
	{
		System.out.println("from test2");
	}

	public static void main(String[] args) 
	{
		J obj = new J();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}