class H											//H class contains static test method.
{
	static void test()
	{
		System.out.println("from H-test");
	}
}

class I extends H								//while overriding should attempt to overriding static method as per compiler rule.
{												//inside I class thr r 2 members(1 is related to I,related to H) coz method is static it is not getting replaced.while loaded I,test method of H is not loaded even though it avaiable.
	static void test()							//static method means develop once keep using many time,don't try to modify.
	{
		System.out.println("from I-test");
	}
}

class Manager4
{
	public static void main(String[] args) 
	{
		H h1 = new H();							//after H class is loaded into memory the obj is loaded into memory,there is no test method loaded into memory
		I i1 = new I();							//same as above
		
		H[] x = new H[2];
		x[0] = h1;
		x[1] = i1;								//auto upcasting, i1 is upcasted to H type

		for (int i = 0;i < x.length; i++ )
		{
			x[i].test();						//H.test(),H type reference. Compiler goes to H class and thr is static method,compiler will replace from ref type to class name.
		}										//if compiler doesn't replace from x[i] to H in the JRE it can't find the test method,instead of CTE it can rectify & replace ref var to class name.
	}											//compiler checks for x datatype it H type.
}

//static means same behaviour forever, can't be modified later.static members are class members.static methods can't be overrided.
//overrided can't be achieved thru static method so polymorphism can't be achieved, static methods are not overrided in the subclass.
//static methods can't be abstract,it should not be same method,abstracts shud be implemented further but static can't be disturbed further.
//non-stativ is instance member/object members.