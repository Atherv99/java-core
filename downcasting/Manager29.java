class Manager29 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		System.out.println(a1 instanceof A);//true
		System.out.println(a1 instanceof B);//true
		System.out.println(a1 instanceof C);//true
		System.out.println(a1 instanceof D);//false
		System.out.println(a1 instanceof String);//CTE String is nowhere related/inherited to A inheritance, a1 instance can be applied to A type
	}
}
//a1 can be applied to only A class inheritance. 

//instance of operater should be used b/w the clases of one inheritance