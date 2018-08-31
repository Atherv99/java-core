class C 
{
	C(int i)
	{
	System.out.println("C(int)");

	}
}
class D extends C
{
	D(int i)     
	{
		super(i);
		System.out.println("D(int)");

	}

	D()     
	{
		
		super(10);
		System.out.println("D()");

	}


	public static void main(String[] args) 
	{
		C c1=new C(20);
	 System.out.println("------");

		D d1=new D(20);
		System.out.println("------");
		D d2=new D();
		
	}
}


// compiler will not provide because laready present. The dD clas will call only the extend ckass in program
