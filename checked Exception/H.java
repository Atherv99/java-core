class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = "abc";
		H h1=(H) s1;    // ths gives class cast exception
		System.out.println("main end");
	}
}


/* H.java:7: error: incompatible types: String cannot be converted to H
                H h1=(H) s1;    // ths gives class cast exception  */