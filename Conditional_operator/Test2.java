package Conditional_operator;

public class Test2 {
	public static void main(String []args)
	{
		int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		else if(i==20)
		{
			j=30;
		}
		System.out.println("");//compilation Error,Variable must not been initialized if printing j value
	}

}
