class J 
{
	J()
	{ 
      System.out.println("J()");
	}

	{
		System.out.println("-IIB-1");
	}

	J(int i)
	{ 
		this();
		System.out.println("J(int)");
		}

	static
		{
			System.out.println("-SIB");
		}
	public static void main(String[] args) 
	{
		J j1=new J();			
		System.out.println("--------");

		J j2=new J(10);
		System.out.println("--------");
		
	}
	
}
