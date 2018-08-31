class K 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		if(flag = true)   // At here we r suppling flag value and flag itself got modified 
		{
		System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(flag);  

	}
}
