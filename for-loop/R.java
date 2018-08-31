class R 
{
	public static void main(String[] args) 
	{
		for(int i=0; i < 10; i++)
			{
		System.out.println("loop begin");
		if(i > 5)
		{
		  continue;   // leaving current iteration move to next iteration
		}
		System.out.println("loop end");
	}
	System.out.println("main end");
}
}
