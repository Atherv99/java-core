interface N
{
	void test1();
}

class O implements N
{
	public void test1()					//every interface method is public to we always use to use public keyword while developed the abstract method
	{
		System.out.println("from test1");
	}
	
	public static void main(String[] args)
	{
		//N n1 = new N();
		//N n2 = null;
		O o1 = new O();
		o1.test1();
		System.out.println("done");
	}
}

/*
we cannot create an object to interface as because its 100% abstract one.

we can create a reference variable to interface.

where ever derived datatype is required there and all we can use interface.

method or constructor or return are argument interface type.

implement always dotted to subclass to super interface.

we must use implement keyword to interface.it will inherit the member of parent class.

we can not create a object to N as N is a interface. we can create reference.
*/