class Z 
{
	
	static
	{
	  System.out.println("SIb begin");
	  Z z1=new Z();
	  System.out.println("SIb end");
	}
	Z()
	{
	System.out.println("Z()");
	}

	public static void main(String[] args) 
	{
		System.out.println("-----");
		Z Z1=new Z();
		System.out.println("-----");
	}
}
