class U 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if((flag = false) && (flag=true))   // at here the flg is modified at the executing first condition
		{
		  System.out.println("from it");
		}
		  System.out.println("end of flag");
		  System.out.println(flag);

	}
}
