class Manager1 
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		A a1 = new A();						// all assignments are homogeneous hence conversion is not required
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		System.out.println("done");
	}
}


/*
two tyee cating
1) Auto up cating 
2)Explicit down cating

1) Auto up casting:-Compilker only automaticaly upcast.Sub class automaticaly assing the super class.

2)Explicit down casting:-Explicit only will be done.Here we will externaly assign the superclass */