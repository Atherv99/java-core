class Manager25 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		System.out.println(11);//11
		B b1 = (B) a1;
		System.out.println(22);//22
		C c1 = (C) a1;
		System.out.println(33);//33
		D d1 = (D) a1;//RTE, Original object is C, can be downcasted to A,B or C not D
		System.out.println(44);
	}
}
