class S 
{
	S()
	{
			System.out.println("S()");

	}
}

class R extends S
{
	R()
	{
	this();        // this super() will execute P construtor.
	System.out.println("R()");

	}

}

class T extends R
{
	T(){
			//super();
			System.out.println("T()");
	}
}
class U
{

	public static void main(String[] args) 
	{
		T t1=new T();
		System.out.println("---------");
		R r1=new R();
		System.out.println("---------");
		S s1=new S();
		System.out.println("---------");



	}
}
