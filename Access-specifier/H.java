class H
{
	public static void main(String[] args) 
	{
		final int[] x = new int[2];				//x is final, x[0],x[1] is modified not x.
		x[0] = 100;
		x[1] = 200;
		System.out.println("done");
	}
}