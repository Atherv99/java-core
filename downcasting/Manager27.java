class Manager27 
{
	public static void main(String[] args) 
	{
		A a1 = new B();//B object poinint to A
		System.out.println(a1 instanceof A);//true, A is pointing to B object
		System.out.println(a1 instanceof B);//true, B is instanceof A&B, thru ref var we can chk object type is A,B,C,D
		System.out.println(a1 instanceof C);//false
		System.out.println(a1 instanceof D);//false
	}
}
//instanceof is a boolean operator,it returns either true/false