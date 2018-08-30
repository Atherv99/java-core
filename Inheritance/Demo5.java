package Inheritance;//EXplicitly Down Casting--Here Super Class is assign to child class reference
 class AB
 {
	 public void test()
	 {
		 System.out.println("Welcome to SRMS");
	 }
 }
public class Demo5 extends AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 a=new Demo5();
		AB b=new AB();
		b=a;
		b=(Demo5)a;
		b.test();
		

	}

}
