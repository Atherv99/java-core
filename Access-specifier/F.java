class F
{
	static final int i = 10;
	static
	{
		i = 10;					//CTE, attempting to reinitialize final global static 
	}
}