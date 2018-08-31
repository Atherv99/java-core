
class A2
{

	int i=10,j=5,c;
		void test2()
	{
	  c=i-j;
	  System.out.println(c);  

    }

}



class C 
{
	int i=10,j=5,c;
	void add()
	{
		c= i+j;
		System.out.println(c);  


	}
}

	class A1 extends C    //class C is super/base/parent/general class and class D is sub/child/special/ class
	{
	public static void main(String[] args) 
	{
		A1 d1=new A1();
		A2 d2=new A2();
		d1.add();
		d2.test2();
		System.out.println("-----------"); 
		//d1.i=10;
		//d1.j=20;
		//System.out.println(d1.i + "," + d1.j);
	}
}

//Inside altogether 4 Non static memeber are alvilabe while creating obj all 4 memeber will bwe loading



// every member is inhriting to B
// inside B clss 2 non static members are loadind while cretin the object
