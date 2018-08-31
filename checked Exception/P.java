class P 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
		}
		catch (ArithmeticException ex)   // here this is to hande arithmetic exception this is nt require for this exception
										// at here this gives classNotFoundException..
		{
		}
	}
}
