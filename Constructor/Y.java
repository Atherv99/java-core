class Y 
{
	Y()
	{
	  System.out.println("Y()");
	}
	
	static
	{
	 Y y1=new Y();
	 System.out.println("SID");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("-----");
		Y y1=new Y();
		System.out.println("-----");
	}
}
