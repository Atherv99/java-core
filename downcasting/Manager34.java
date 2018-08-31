class X 
{
	int i;
	void test1()
	{
		System.out.println("X-test1");
	}
}

class Y extends X
{
	int j;
	void test2()
	{
		System.out.println("Y-test2");
	}
}

class Manager34
{
	public static void main(String[] args) 
	{
		Object obj1 = new X();//Object class doesn't contain test1 & test2
		obj1.test1();//1,CTE
		obj1.test2();//2,CTE

		Object obj2 = new Y();//Object class doesn't contain test1 & test2
		obj2.test1();//3,CTE
		obj2.test2();//4,CTE

		X x1 = new X();
		x1.test1();//5,0
		x2.test2();//6,CTE

		X x2 = new Y();
		x2.test1();//7,0
		x2.test2();//8,CTE test2 not available

		Y y1 = new Y();
		y1.test1();//9,0
		y1.test2();//10,0

		obj1.i=1;//11,CTE
		obj1.j=1;//12,CTE
		obj2.i=1;//13,CTE
		obj2.j=1;//14,CTE

		x1.i=1;//15,0
		x1.j=1;//16,CTE
		
		x2.i=1;//17,0
		x2.j=1;//18,CTE

		y1.i=1;//19,0
		y1.j=1;//20,0
		System.out.println("done");
	}
}
