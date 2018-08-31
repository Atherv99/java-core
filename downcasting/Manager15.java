class Manager15 
{
	public static void main(String[] args) 
	{
		B b1 = new D();//auto upcasting, D type to B type
		C c1 = b1;//CTE, downcasting not done by compiler.
		System.out.println("done");
	}
}
