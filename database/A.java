import java.sql.*;
class A 
{
	public static void main(String[] args) 
	{
		Connection con=
			DriverManager.getConnection("","","");  //htis require sql connection and SQL exception give compile error
	}
}
