class E 
{
	int i;
	static int j;
	void test1()
	{
	   System.out.println("from test1");  

	}
	static void test2()
	{
	   System.out.println("from test2");  

	}
}

	class F extends E    //class C is super/base/parent/general class and class D is sub/child/special/ class
	{
		int m;
		static int n;
		void test3()
	{
			System.out.println("from test3");  

	}
	static void test4()
	{
			System.out.println("from test4");  

	}
	}
	

	class G
	
	{
	public static void main(String[] args) 
	{
		E.test2();
		F.test2();
		F.test4();
		E.j=10;
		F.n=20;
		E e1=new E();
			e1.i=30;
		e1.test1();

		F f1=new F();

		f1.i=40;
		f1.m=50;
		f1.test1();
		f1.test3();
		System.out.println("-----------"); 
		System.out.println(E.j); 
		System.out.println(F.n); 
		System.out.println(e1.i); 
		System.out.println(f1.i + "," + f1.m);
	}
	}

//Inside altogether 4 Non static memeber are alvilabe while creating obj all 4 memeber will bwe loading



// every member is inhriting to B
// inside B clss 2 non static members are loadind while cretin the object
