class S 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 1) && (i++ == 1))  
		{
		  System.out.println("from");
		  i++ ;   
		}
		System.out.println("end of main");
		System.out.println(i);             // at here the i is executing again so the value will be change to 1
	}
}
