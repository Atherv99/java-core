class V											//dependency compilation
{
	static
	{
		System.out.println("V-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("V-main-begin");
		
		U.main(args);							//String array is called main() method
		
		System.out.println("-------------");
		
		U.main(null);							//null is called in main() method
		
		System.out.println("V-main-end");
	}
}

//as the U.main(null) is compile is runnimng again so that it will not run the static. 
//V is first loaded into memory then U class is loaded and used multiple times
//compile V.java without compiling U.java successfully. It is internally calling U class.
//As it required U class it creates class file when V.java is compiled.