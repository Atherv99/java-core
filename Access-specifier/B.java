class B 
{
	public static void main(String[] args) 
	{
		final int i;
		i = 10;
		System.out.println(i);
		//i = 10;									//CTE, attempting to reinitialize will throw error
		System.out.println(i);
	}
}