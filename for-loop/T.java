class T 
{
	public static void main(String[] args) 
	{
		for(int i=0; i < 10; i++)
			{
		System.out.println("loop begin");
		if(i > 5)
		{
		  break;
		  // this will execute till i = 5 after that it will stop. after that the begin will start and will print the last.
		
		
		System.out.println("if block");  // this causes the compile time error.

		}
		System.out.println("loop end");
	}
	System.out.println("main end");
}
}