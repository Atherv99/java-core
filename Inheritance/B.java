class A
{
	A(int i)
	{
	  System.out.println("A(int)");
	}
}

Class B extends A
{
	B()
	{
		System.out.pritnln("B()");
	
	}
	public static void main(String[] args)
	{
	
	A a1=new A(90);
	System.out.println("--------");
	B b1 =new B();
	}

}