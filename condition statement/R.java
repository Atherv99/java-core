class R 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 0) && (i++ == 1))  // in the second the i become 2
		{
		  System.out.println("from");
		  i++ ;   // and this will become the 3 but use is 2 and in the last the i become 3
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
