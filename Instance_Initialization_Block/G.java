class G 
{

	{
	 System.out.println("-IIB-1");

	}

	G()
	{
		this(30);
		System.out.println("G()");

	}

    G(int i)
	{
		
		System.out.println("G(int)");

	}
     /*because of "this" two constructor will be execute only one time, 
	 but because of IIB one object will be execute one IIB at one time*/ 

	public static void main(String[] args) 
	{
		G g1=new G();			
		System.out.println("--------");

		G g2=new G(10);
		System.out.println("--------");
	}
	
}
