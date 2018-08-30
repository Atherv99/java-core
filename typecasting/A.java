package typecasting; //how to calling Instance method by creating object reference variable

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
		A obj=new A();
		obj.test();
		obj.test1();

	}
	public void test()
	{
		System.out.println("Inside Test1");
	}
	public void test1()
	{
		System.out.println("Inside Test2");
	}

}
