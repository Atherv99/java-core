class V 
{
	public static void main(String[] args) 
	{
		double d1 = 10.90;
		long lon = (int) d1;					//double into int(double int long is not possible) so double=>int=>long.
												//here compiler is converting int=> long automatically.
		System.out.println("done");
	}
}