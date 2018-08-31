class M
{
	M(int i)
		{
		System.out.println("M(INT)");
		}

	{
		System.out.println("IIB");
	}

	M(int i,int j)
	{
	 this(i);
	 System.out.println("M(int,int)");
	}
}

class N
{
	N()
	{
		super(10,20);
	  System.out.println("N()");
	}
	{
	System.out.println("N(IIB)");
	}
	N(double i)
	{
	 super(10);
	 System.out.println("N(double)");
	}

	public static void main(String[] args)
	{
	M m1=new M(10);
	System.out.println("...........");
	M m2=new M(10,4);
	System.out.println("...........");
	N n1=new N();
	System.out.println("...........");
	N n2=new N(10);
	System.out.println("...........");
	N n3=new N(1.2);
	System.out.println("...........");

}
}