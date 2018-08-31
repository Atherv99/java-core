import java.io.*;
class I
{
	public static void main(String[] args) 
	{
		new FileWriter("");  // this require IO exception which is unchecked exception.
		System.out.println("Hello World!");
	}
}
