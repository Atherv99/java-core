//Method will return value back to place from where it is called
package typecasting;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Inside Main");
		Demo1 d=new Demo1();
	   int total	=d.test(10, 20);//calling statement
	  System.out.println(total);

	}
	public int test(int a,int b) //called statement
	{
		System.out.println("Adding");
		int c;
		c=a+b;
		return c;
		
	}

}
