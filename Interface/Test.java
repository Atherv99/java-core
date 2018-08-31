package Interface;

interface I
{
	int x=20; //by default public static final
	void m1();//by default public abstract
	void m2();
	void m3();
}
class A implements I
{
	public void m1()
	{
		System.out.println("Hello 1");
	}
	public void m2()
	{
		System.out.println("Hello 2");
	}
	public void m3()
	{
		System.out.println("Hello 3");
	}
	public void m4()
	{
		System.out.println("Hello 4");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		  a.m1();
		  a.m2();
		  a.m3();
		  a.m4();

	}

}
/* If we declare reference variable for interface than we can access only interface members but if we declare reference 
 * vaiable of implementation class than we can access both Interface and own class*/
