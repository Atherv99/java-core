class Manager31 
{
	static void test(Object obj)//if argu is Object type then we can upcast to A,B,C,D type
	{
		if (obj instanceof A)
		{
			System.out.println("V can cast into A");
			A a2 = (A) obj;
		}
		if (obj instanceof B)
		{
			System.out.println("V can cast into B");
			B b2 = (B) obj;
		}

		if (obj instanceof C)
		{
			System.out.println("V can cast into C");
			C c2 = (C) obj;
		}
		if (obj instanceof D)
		{
			System.out.println("V can cast into D");
			D d2 = (D) obj;
		}
		System.out.println("---------------------");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();//a1 is instance of A, 1 if block is executed
		A a2 = new B();//a2 is instance of B,A & B if blokcs are executed.
		A a3 = new C();//a3 is instance of C,A,B & C if blokcs are executed.
		A a4 = new D();//a4 is instance of D,all if blokcs are executed.
		test(a1);
		test(a2);
		test(a3);
		test(a4);
	}
}
