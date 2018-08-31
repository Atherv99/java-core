class Manager17 
{
	public static void main(String[] args) 
	{
		A a1 = new D();//auto upcasting.
		B b1 = (B) a1;//explicit downcasting,A type to B 
		C c1 = (C) b1;//explicit downcasting,B type to C
		D d1 = (D) a1;//explicit downcasting,A type to D
		System.out.println("done");
	}
}
