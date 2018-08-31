class A 
{
	void test()
	{
		System.out.println("from A");
	}
}

class B extends A
{
	void test()									//same A class method got overrided in B class
	{
		System.out.println("from B");
	}
}

class Manager1
{
	public static void main(String[] args) 
	{
		A a1 = new A();							//creating object to A, which has SOP from A from test method
		B b1 = new B();							//creating object to B, inside B class whichever method is there it is loaded into B
		A[] x = {a1, b1};						//array of type A,x is A type array can store only A type members also b1. B type element b1 type will be automatically upcasted to A type
												//after conversion it is pointing to B object only.
		for (int i = 0; i < x.length; i++ )		//because of iteration it is executed twice,1s time A class test method,2nd time B class test method.
		{										//x.length=> total no of elements i.e
			x[i].tesr();						//Polymorphism	x[i].test();//same stmt giving call to 2 methods in 2 different classes.(Executing different methods from same stmt)
		}
	}
}

//1st iteration, i value 0,a1 = i. x of 0 is a1
//2nd iteration, x[i] is pointing to b1

/*to achieve polymorphism need to follow 2 conditions
1. method overriding 
2. auto upcasting.
*/