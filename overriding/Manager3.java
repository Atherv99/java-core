class E 
{
	void test()
	{
		System.out.println("from E-test");
	}
}

class F extends E								//test method got overrided.
{
	void test()
	{
		System.out.println("from F-test");
	}
}

class G extends F								//G also got overrided
{
	void test()
	{
		System.out.println("from G-test");
	}
}
	
class Manager3
{
	public static void main(String[] args) 
	{
		E e1 = new E();							//creating obj to E,inside E class whatever test method is thr that is loaded
		F f1 = new F();							//creating obj to F,inside F class whatever test method is thr that is loaded
		G g1 = new G();							//creating obj to F,inside G class whatever test method is thr that is loaded
		E e2 = new G();							//auto upcasting to E type,creating obj to G class obj type is upcasting,G class memebers loaded into E
		E e3 = new F();							//auto upcasting
		
		E[] x = new E[5];

		x[0] = e1;								//homogenous assignment
		x[1] = f1;								//upcasted to E type,finally pointing to x type
		x[2] = g1;								//from G,upcasted 
		x[3] = e2;								//e2 poining to G object
		x[4] = e3;								//e3 pointing to F object
		
		for(int i =0; i < x.length; i++)			//iterating 5 times.
		{
			x[i].test();
		}
	}
}