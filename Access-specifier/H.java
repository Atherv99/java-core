class H 
{
	final int i;								//not static global final,it is final to 1 object for other may be same or may not be, obj wise its constant

	H()
	{
		i = 10;
	}

	H(double j)
	{
		i = 20;
	}

	public static void main(String[] args)
	{
		H h1 = new H();
		H h2 = new H(90.90);

		System.out.println(h1.i);
		System.out.println(h2.i);
	}
}

//i is constant for particular object. Thru execution wise it is different,later it cant be modified.