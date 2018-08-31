class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
				Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
	
		System.out.println("main end");
	}
}

/* while running main begin and the same exception then exception is handel so main end  */