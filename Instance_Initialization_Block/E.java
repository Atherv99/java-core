class E 
{

	{
			System.out.println("IIB-1");

	}

	E(int i)
	{
			System.out.println("E(int)");

	}

	public static void main(String[] args) 
	{
		E e1=new E(30);			
		System.out.println("--------");

		E e2=new E(10);
		System.out.println("--------");
	}
		{
			System.out.println("IIB-2");   
			//by we can develop IIB anywhere in current class.For every object creation all IIB will be executing from top to bottom.

		}
}
