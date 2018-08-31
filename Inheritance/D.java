class C 
{
	int i;
	void test1()
	{
			System.out.println("from test1");  

	}
}

	class D extends C    //class C is super/base/parent/general class and class D is sub/child/special/ class
	{
		int j;
		void test2()
	{
		System.out.println("from test2");  

	}
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test1();
		d1.test2();
		System.out.println("-----------"); 
		d1.i=10;
		d1.j=20;
		System.out.println(d1.i + "," + d1.j);
	}
}

//Inside altogether 4 Non static memeber are alvilabe while creating obj all 4 memeber will bwe loading



// every member is inhriting to B
// inside B clss 2 non static members are loadind while cretin the object
