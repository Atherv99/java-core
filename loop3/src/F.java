class F{

	public static void main(String args[]){
	
		boolean flag = false;
		int  i = 10;
		if(flag = true){
		
			
			System.out.println("inside if:"+ (--i));
		}
		else
		{
		
			System.out.println("inside else:" + i++);
		}
		System.out.println("main end :" + i);
	}
}