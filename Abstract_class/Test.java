package Abstract_class;
abstract class A
{
	void m1()
	{
		System.out.println("Welcome to SRMS");
	}
	abstract void m2();
	abstract void m3();
	
}
class B extends A
{
	void m2()
	{
		System.out.println("Hello All friends");
	}
	void m3()
	{
		System.out.println("Hello Man");
	}
	void m4()
	{
		System.out.println("Hello");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A()  Error
		A a=new B();
		  a.m1();
		  a.m2();
		  a.m3();
		//  a.m4(); Error
		B t=new B();
		     t.m1();
		     t.m2();
		     t.m3();
		     t.m4();

	}

}
/*
 Note: If we declare reference variable for abstract class then we are aable to access only abstract class members
 but if we declares sub class reference variable than we are able to access both abstract class members and sub class members
*/
