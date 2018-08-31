class T 
{
	public static void main(String[] args) 
	{
		double d1 = 10.9;
		float f1 = (float) d1;					//explicit narrow
		int i = (int) f1;						//explicit narrow
		byte b = (byte) i;						//explicit narrow
		System.out.println("done");
	}
}