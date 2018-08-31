 import java.sql.*;
 class D
{
	public static void main(String[] args) 
	{
		try
		{
			Connection con=
			DriverManager.getConnection("","","");  	
		}
			
		
		catch (ClassNotFoundException ex)
		{
		}
	}   //try shoukd not b eempty
}
/*exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^
D.java:9: error: unreported exception SQLException; must be caught or declared to be thrown
                        DriverManager.getConnection("","",""); */
                                                   ^