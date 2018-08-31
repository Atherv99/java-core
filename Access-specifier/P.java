class P 
{
	int i = 10;
	public static void main(String[] args) 
	{
		final P p1 = new P();
		p1.i = 10;								//p1 is final,i is not final thru p1 i is getting modified. 
		System.out.println("done");
	}
}