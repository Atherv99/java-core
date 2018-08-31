class S 
{
	static int test(double d1)
	{
		return (int)d1;						//test method return type is int, double can't be converted straight away, before returning convert double d1 into int.
	}										//Now 10.9 is 10 and its sent to test(10.9). It is assigned to long lon, SOP is 10

	public static void main(String[] args) 
	{
		long lon = test(10.9);
		System.out.println(lon);
	}
}