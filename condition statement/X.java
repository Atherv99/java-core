class X
{
	public static void main(String[] args) 
	{
		int i=0;

		if((i++ == 0) || (i++ == 1))   // here two condition if one get executed no need to execute second ..
		{
		System.out.println("from if");
		i++;
		}
		System.out.println("main end");
		System.out.println(i);

	}
}
