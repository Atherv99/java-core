class I 
{
	public static void main(String[] args) 
	{
		final int[] x = new int[3];
		x = null;							//CTE, x is getting modified.
		System.out.println("done");
	}
}