class C 
{
	C()
	{
			System.out.println("c()");

	}

	{
			System.out.println("IIB");

	}

	C(int i)
	{
			System.out.println("c(int)");

	}

	public static void main(String[] args) 
	{
		C c1=new C();			//by default only one constructoer is execute.
		System.out.println("--------");

		C c2=new C(10);
		System.out.println("--------");
	}
}


/* no matter whicch constructor is using either 1st or 2nd first IIB will be execute.IIB execution will be depend on object creation.
one constructer will be executee for one object.other constructer will not be executing.*/
