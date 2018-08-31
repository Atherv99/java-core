class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] x = {10,20,30};  
		//element from zero to two ,but we are refering to 8th index insted of that it will ompile sucessfull
		
		
		int i = x[8];
		System.out.println("main end");
	}
}
