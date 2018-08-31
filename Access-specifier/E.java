class E 
{
	static final int i;
	
	static					//thru SIB can initialize global final static
	{
		i = 10;				//compilation is successful.
	}
}