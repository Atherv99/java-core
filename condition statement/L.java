class L 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if(flag = false)   // At here we r suppling flag value and flag itself got modified so will print false value
		{
		System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(flag);  

	}
}
