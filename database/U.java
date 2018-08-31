
class U  
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 10;  // as the this stsmt is not require for catch handel..
			
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}

/*   exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^  */

