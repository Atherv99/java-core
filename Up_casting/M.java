class M										//explicit widening in 2 places
{
	public static void main(String[] args) 
	{
		byte b = 10;
		
		int i = b;
		int j =  b;     //metod of explicit widrng
		

		double d1 = (int)i;
		double d2 = (double) i;
		
		System.out.println("done");
	}
}   