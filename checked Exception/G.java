class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj=new Object();              //as the Object is supper and it is creation object it will compile sucecc
		H h1=(H) s1;                          // ths gives class cast exception
		System.out.println("main end");
	}
}
