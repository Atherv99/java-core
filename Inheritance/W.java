class V
{
	V(int i)
	{
			System.out.println("V()");

	}
}


class W extends V
{
	W(int i)
		{    /*in this ther is no arg constructor availabe as his W class super  
	           contruc will call the to V with no arg but in V there is no any 
			   constructor with no agr so give error */ 
		       

			System.out.println("W()");
	}

	public static void main(String[] args) 
	{
		V v1=new V(90);
		System.out.println("---------");
		W w1=new W(90);
		System.out.println("---------");
	}
}
