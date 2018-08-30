package Conditional_operator;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before loop");
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				System.out.println("Inside loop ,Before break");
				break;
				//System.out.println("Inside loop ,After break");
			}
			System.out.println("After loop");
		}

	}

}
//Status: Compilation Error
//Unreachable statement
//Reason: if we provide any statement  immediate after break statement than that statement is unreachable statement,where compiler an arise an Error
