class C 
{
	static int i;

	static void test()
	{
		System.out.println("from test: " + i);
	}

}

class D1
{
	public static void main(String[] args) 
	{
		System.out.println("from main" +C.i);
		C.test();
	}
}

//Class D is calling a method of class C internally which is having main() method.
//while using one class static member in other class it should be called with the class name & .(dot) operator static member of other class.