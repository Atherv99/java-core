class Z5 
{
	final int i;//non static global final
	
	Z5()
	{
		i = 10;					//CTE,final i is getting modified
	}

	{
		i =10;
	}
}