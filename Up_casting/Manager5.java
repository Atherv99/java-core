class Manager5 
{
	public static void main(String[] args) 
	{
		A a1 = new B();  // A a1=(A) new B(); this is done by compiler
		B b1 = new C();//auto upcasting, compiler is converting subclass to superclass type
		C c1 = new D();
		Object o1 = new A();//upcasting, subclass type is assigned to superclass type
		System.out.println("done");//done
	}
}
