import java.text.*;
class R 
{
	public static void main(String[] args) 
	{
		DateFormat df = null;
		df.parse("");     // thsi is checked exception.
		System.out.println("abcd");
	}
}

/*   error: unreported exception ParseException; must be caught or declared to be thrown
                df.parse(""); */
