dclass Manager24 
{
	public static void main(String[] args) 
	{
		A a1 = new B();//Original object is B type,its instance of A & B
		System.out.println(11);//11
		B b1 = (B) a1;
		System.out.println(22);//22
		C c1 = (C) a1;//RTE,a1 can't be downcasted into C type,while downcasting it throws RTE
		System.out.println(22);
	}
}
