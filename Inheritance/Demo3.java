package Inheritance;// Auto Up Casting--Here parent class reference will point to child class object

class ABC
{
	public void test()
	{
		System.out.println("Hello Welcome to SRMS");
	}
}
public class Demo3 extends ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new Demo3();//Auto Up Casting
		a.test();
	

	}

}
