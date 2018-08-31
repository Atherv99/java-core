class Manager13 
{
	public static void main(String[] args) 
	{
		A a1 = new B();//compiler will upcaste from B type to A type
		B b1 = a1;//CTE,RHS is superclass type, LHS is subclass type down casting is required which is done explicity
		System.out.println("done");
	}
}
