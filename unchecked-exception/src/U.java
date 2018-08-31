class T 
{
	void test1() throws NullPointerException    /* 1- Any method can ovverride without throws. 
	we can ovverride test1() in sub class sucessfullyy  If it is throwing it wont care weather it is checked or not
	*/
	{
	  
	}
}

class U extends T
{
	void test1() throws NullPointerException  /* 2-Any method can ovverride by choosing thros unchecked.
	                                              while ovverriding i m throwing unchecked  */
	{
	
	}
}
