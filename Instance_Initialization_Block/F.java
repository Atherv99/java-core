class F 
{

	{
	  System.out.println("F-IIB-1");
	}

	F(int i)
	{
		this();
		System.out.println("F(int)");
	}

	F()
	{

	 System.out.println("F()");

	}

     /* because of "this" two constructor will be execute only one time, 
	 but because of IIB one object will be execute one IIB at one time */

	public static void main(String[] args) 
	{
		F f1=new F();			
		System.out.println("--------");

		F f2=new F(10);
		System.out.println("--------");
	}
	
}
