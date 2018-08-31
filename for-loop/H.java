class H 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 0; i< 5; i++);  // at here the loop is execiting inside but it have the ;.for loop doesn't have body becaus of ending statement..
		System.out.println("loop: " + i);
		System.out.println("main: " + i);
	}
}
