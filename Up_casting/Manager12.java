class Manager12 
{
	public static void main(String[] args) 
	{
		A a1 = (A) new B();//explicity upcaste(not mandatory) still compiler will do upcaste
		A a2 = new B();//auto upcasting.

		C c1 = new D();
		C c2 = (C) new D();
		System.out.println("done");//done
	}
}
