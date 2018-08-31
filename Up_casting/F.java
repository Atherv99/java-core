class F 
{
	static double test()
	{
		int i = 10;
		return i;									//return(double i)
	}

	public static void main(String[] args) 
	{
		System.out.println(test());
	}
}

//while converting it will convert 10 to 10.0. test method return type is double