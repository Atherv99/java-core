class P 
{
	int i;//by using P refernce we can access only i
}

class Q extends P
{
	int j;//by uisng P ref we can access i & j
}

class Manager32
{
	public static void main(String[] args) 
	{
		P p1 = new P();//p1 no upcasting
		System.out.println(p1.i);//while compiling it will chk datatype of ref var, not worry of obj type i is there in P class or not.

		Q q1 = new Q();//q1 no upcasting
		System.out.println(q1.i);//i is there in Q
		System.out.println(q1.j);//j is there in Q

		P p2 = new Q();//require downcasting
		System.out.println(p2.i);//compiler chk what is p2 not where its poiniting to.
		
		
		//System.out.println(p2.j);  P only consist of i not consist of j so this will give error
		
		
		//CTE,compiler chk what is p2 not where its poinint to,in order to acces j u need to downcast get suggestion from instatnceof,if its true then downcast will execute
		//j can't be accessed using p2,use downcast
		if (p2 instanceof Q)
		{
			Q q2 = (Q) p2;
			System.out.println(q2.i);
			System.out.println(q2.j);
		}
	}
}
