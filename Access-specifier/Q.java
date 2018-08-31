class P							//final keyword can be used for methods also
{
	final void test1()			//final methods should not modify in the subclass,if attempting to modify throws CTE
	{
	}
	 
	 void test2()
	{
	}
}

class Q extends P
{
	void test1()				//CTE, test1 declared as final,attempting to override in the subclass
	{
	}

	void test2()
	{
	}
}