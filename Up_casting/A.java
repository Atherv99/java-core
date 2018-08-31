//byte < short < int < long < float < double
class A
{
	public static void main(String[] args) 
	{
		int i = 10;
		double d = i;						//double d = (int) i
											//int is narrower than double(narrower into wider)
		System.out.println("done");
	}
}

//i is assigned to d i.e int is assigned to double. 
//Compiler will automatically incorporate conversion stmt in .class file