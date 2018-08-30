//In Inheritance properties one class is inherited into another to create class for better re usability of code and easy enhancement
package Inheritance;

class A
{
	public void test1()
	{
	System.out.println("Inside Test1")	;
	}
	public void test()
	{
	System.out.println("Inside Test2");	
	}
}
public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main B");
		B b1=new B();
		b1.test();
		b1.test1();

	}

}
