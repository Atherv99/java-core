package typecasting;//How to call method by using static keyword in method

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
		Demo.test1();
		Demo.test2();
	}//I am calling Test1,test2 by using class name because it is static member
		public static void test1()
		{
			System.out.println("Inside Test1");
		}
     public static void test2()
     {
    	 System.out.println("Inside Test2");
     }

	

}
