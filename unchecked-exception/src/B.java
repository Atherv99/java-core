class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");

	}

	static void test1()
	{
	System.out.println("test1 begin");
	int i=10/0;
	System.out.println("test1 begin");
	}
}
/*  java command then method- send to another method- no try catch no one is 
handel-because of this no this then java command is handel and come back after givng exception info. is called forcable */


