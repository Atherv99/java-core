class Manager21
{
	static C test()
	{
		A a1 = new D();
		return (C)a1;//explicit downcasting.
	}

	public static void main(String[] args) 
	{
		D d1 = (D)test();//return type is downcasted
		System.out.println("done");
	}
}
