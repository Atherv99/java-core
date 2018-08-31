class Manager28 
{
	public static void main(String[] args) 
	{
		A a1 = new D();//all pointing to D object
		System.out.println(a1 instanceof Object);//true
		System.out.println(a1 instanceof A);//true
		System.out.println(a1 instanceof B);//true
		System.out.println(a1 instanceof C);//true
		System.out.println(a1 instanceof D);//true
	}
}
