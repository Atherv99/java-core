package Conditional_operator;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before loop");
		for(int i=0; true;i++)
		{
			System.out.println("Inside loop");//Infinte loop executing
		}
		//System.out.println("After loop"); Compilation Error when "after loop" is executing

	}

}
