class O 
{
	final int i = 10;
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.i = 10;								//CTE, final i is getting modified.
		System.out.println(o1.i);
	}
}