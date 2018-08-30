package Interface_and_abstract;

interface ExampleInterface
{
	void a();
	void b();
	void c();
	void d();
}
class Test implements ExampleInterface
{
	public void a()
	{
		System.out.println("Inside A");
	}
	public void b()
	{
		System.out.println("Inside B");
	}
	public void c()
	{
		System.out.println("Inside C");
	}
	public void d()
	{
		System.out.println("Inside D");
	}
} class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.a();
		t.b();
		t.c();
		t.d();

	}

}
