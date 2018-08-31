class Manager26 
{
	public static void main(String[] args) 
	{
		A a1 = new B();//upcasting, then downcasting, its allowed only then
		B b1 = (B) a1;
		System.out.println("----------");
		A a2 = new A();// no casting at all,if no upcasting we can't do downcasting
		B b2 = (B) a2;//RTE
	}
}
