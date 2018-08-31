class Z 
{
	static						//inside SIB method can't be developed.
	{
		static void test()		//for method without static also you get compile time error.
		{						//It should be member of class not definition block
		}
	}
}