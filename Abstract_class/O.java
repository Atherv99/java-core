abstract class  N
{
	void test1()
	{
	 System.out.println("from test1");//any class can be abstract.if minimum method is abstract then that should be declared as abstract class.
	}
}

class O extends N						//if O can be abstract class than we cant make object.
{
	public static void main(String[] args) 
	{
		//N n1 = new N();
		//n1.test1();
		System.out.println("............");
		
		O o1 = new O();
		o1.test1();
		
		System.out.println("..........");
	}
}