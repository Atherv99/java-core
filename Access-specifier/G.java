class G 
{
	static final int i;

	static 
	{
		i = 10;
	}

	static 
	{
		i = 10;				//CTE,attempting to reinitialize static global final i
	}
}