class W 
{
	public static void main(String[] args) 
	{
		int i = 10;
		static int j = 20;		//compile time error.
		
		System.out.println(i);
		System.out.println(j);
	}
}

//static keyword cannot be used for local members, static keyword is only for the class members.