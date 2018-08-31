class A 
{
	int i;
}

	class B extends A    //class A is super/base/parent/general class and class B is sub/child/special/ class
	{
	   int j;
	   public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.i);  
		System.out.println(b1.j);
	}
}


// every member is inhriting to B
// inside B clss 2 non static members are loadind while cretin the object
