class P 
{
	public static void main(String[] args) 
	{
		P p1 = new P();
		Object obj=p1.clone();  // because of this clone we got exception
		System.out.println("done");
	}
}

/*   P.java:6: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
                Object obj=p1.clone();  */
