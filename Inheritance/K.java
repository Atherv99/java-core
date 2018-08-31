
class I 
{
	I()
	{
			System.out.println("I()");

	}
	}

	class J extends I
	{
		J()
	{
			//super();
			System.out.println("j()");

	}
	}

	class K
	{
	public static void main(String[] args)
	{
		I obj1=new I();
		System.out.println("------");
		J obj2=new J();
		System.out.println("------");
	}
}


/*contructor ,IIB and SIB are not inheriting the class .so there are not involoving the inheritance.I class contructor r not inheriting the J even though the J sub class  is sub class to I ,I contructor r not inheriting to J
 while creating the object to J even I class contructor also executing.
 In every contructor body 1st statement should be either suber calling of this calling..If u r not providing super or this ,compiler creating super with no argument ,
 acc to compiler contract, in every contract 1st stmt should be either super calling or this calling inside a constructor here,compiler kept supercallg stmt and SOP, in compiler*/

