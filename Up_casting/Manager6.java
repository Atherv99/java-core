class Manager6 
{
	public static void main(String[] args) 
	{
		A a1 = new C();//In every assignment compiler is converting subclass to superclass type(RHS to LHS)
		Object o1 = new D();
		B b1 = new C();
		C c1 = new D();
		B b2 = new D();
		Object o2 = new C();//C type to Object class type
		System.out.println("done");
	}
}
