import java.sql.*;
class B 
{
	public static void main(String[] args) 
	{
		try // this try ewill hande the exception
		{
		Connection con=
			DriverManager.getConnection("","","");  	
		}
		catch (SQLException ex)
		{
		}
		
	}
}
