class B 
{
	B()
	{
			System.out.println("B()");

	}
	{
			System.out.println("IIB");

	}

	public static void main(String[] args) 
	{
		B b1=new B();			
		System.out.println("--------");

		B b2=new B();
		System.out.println("--------");
	}
}


/* IIB stands for (instance initialisation bklock.for every object creation specify contructor and IIB.
IIB alwasy created for every object not only for specify constructoe IIB also executing */

