class Z3 
{
	final int i;

	{
		i = 10;
	}

	{							//both IIB are executed,attmepting to reinitialize
		i = 10;					
	}
}