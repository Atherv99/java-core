class K 
{
	public static void test(int i, final int j)					//arguments of method can be final,argu are automatically initializing thru calling stmt
	{
		i = 10;													//non final
		j = 10;													//final variable, CTE

		System.out.println(i);
		System.out.println(j);
	}
}