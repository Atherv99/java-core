class W 
{
	public static void main(String[] args) 
	{
		double d1 = 10.9090;
		int i = (byte)(short)(int) d1;				//compiler converts byte into int automatically
		System.out.println(i);
	}
}