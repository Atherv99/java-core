class I 
{
	I()     
	{
		System.out.println("I()");
		}

	{
	System.out.println("IIB");
	
	}

	I(int i)
	{
	System.out.println("I(int)");

	}
	
	I(double d)
	{
		this();
	System.out.println("I(double)");
	}
	
	public static void main(String[] args) 
	{
		I i1=new I();
	 System.out.println("------");
	    I i2=new I(20);
		System.out.println("------");
		I i3=new I(2.0);
		System.out.println("------");
		
		// for both the F class the super is call to E

		
	}
}


// compiler will not provide because laready present. The dD clas will call only the extend ckass in program
