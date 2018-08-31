class Q										//Lose of precision
{
	public static void main(String[] args) 
	{
		double d1 = 12.9;
		int i = (int) d1;					//narrow explicitly, there might be chance of losing data,trimming might happen
		System.out.println(d1);
		System.out.println(i);
	}
}