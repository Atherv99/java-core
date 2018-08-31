class Manager9 
{
	static Object test1()//test method is Object type
	{
		D d1 = new D();
		return d1;//return D type. D type can be automatically converted to Object type
	}

	public static void main(String[] args) 
	{
		Object obj = test1();
		System.out.println("done");
	}
}
