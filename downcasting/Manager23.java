class Manager23 
{
	public static void main(String[] args) 
	{
		A a1 = new C();//Original object is C. this consit of B and C member
		System.out.println(11);
		B b1 = (B) a1;
		System.out.println(22);
		C c1 = (C) a1;
		System.out.println(22);
	}
}
