class C{

	public static void main(String args[]){
	
		boolean flag = false;
		if(flag = true){
		
			int i = 10;
			System.out.println("inside if");
		}
		else
		{
			System.out.println("inside else:" +i);
			i = 20;
		}
		System.out.println("main end");
	}
}