class U 
{
	public static void main(String[] args) 
	{
		int i = 10;
		short s = (byte) i;					//int can't be straight away assigned to short do narrow from byte to short.
											//int into byte, byte assigned to short compiler convert byte into short
		System.out.println("done");
	}
}