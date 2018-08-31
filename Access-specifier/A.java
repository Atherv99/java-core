class A 
{
	public static void main(String[] args) 
	{
		final int i = 10;						//final variables cannot be reinitialized. 
		int j = 20;
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("-----");
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("-----");
		
		i = 10;									//no matter value will change or not it throws CTE
		j = 20;

		System.out.println(i);
		System.out.println(j);
	}
}