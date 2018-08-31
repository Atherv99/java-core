class X 
{
	public static void main(String[] args) 
	{
		double d1 = 10.90;
		System.out.println(test((short)(byte)d1));				//while calling test method double=>type=>short.
	}															//compiler is converting short into int type

	static double test(int i)									//test return type is double, auto widening.
	{
		return i;
	}
}