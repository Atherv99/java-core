class T										//dependency compilation
{
	public static void main(String[] args) 
	{
		System.out.println(R.i);
		S.test();
	}
}

//without compiling R.java & S.java we can successfully compile T.java. It is calling R class & S class internally.
//It has created R.class & S.class files automatically while compiling.
//if there is any compilation error in any of R & S class it will not create class file.