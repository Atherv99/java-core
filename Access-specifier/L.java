class L 
{
	public static void main(final String[] args)				//main method argu String[]arg declared final,not modifying args but args[0]
	{
		args[0] = "hello";										//RTE, Exception
		System.out.println("done");
	}
}