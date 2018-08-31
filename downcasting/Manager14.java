class Manager14 
{
	public static void main(String[] args) 
	{
		A a1 = new B();//auto upcasting
		B b1 = (B) a1;//downcasting explicitly,converting A type into B type
		System.out.println("done");
	}
}
