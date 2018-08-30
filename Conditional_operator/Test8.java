package Conditional_operator;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("After loop");
		
		//for(i=0;;i++)  compilation Error, Unreachable Statement
		{
			System.out.println("Inside loop");
		}
		System.out.println("After loop");

	}

}
