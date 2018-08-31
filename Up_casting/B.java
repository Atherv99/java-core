class B 
{
	public static void main(String[] args) 
	{
		byte b = 10; 
		int i = b;									//int i = (byte) b; Auto wildering
													//byte is narrower than int. Narrower into wider.
		System.out.println("done");
	}
}

//compiler will automatically convert byte into required int in .class file. 