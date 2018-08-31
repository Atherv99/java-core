class I										 //Perfect constant are static final as the value is constant through out the execution.
{
	static final int x = 10;				//x is loaded only once into memory,x value is 10 and its constant thru out execution

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
	}
}