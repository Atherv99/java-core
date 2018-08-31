class N 
{
	public static void main(String[] args) 
	{
		Thread.sleep(1000);   // this provisde interrpted exception
	}
}

/* unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);  */