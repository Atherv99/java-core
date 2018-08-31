class F 
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("from main: " + i);
		System.out.println("from main2: " + F.i);
	}
}

class G
{
	public static void main(String[] args)
	{
		System.out.println("from main3	: " + F.i);
	}
}

/* can save with any name as both classes are non public.
Now run each class seperately with the class name as java command can execute */
//only one class at a time. 
//Output is individual class outputs.