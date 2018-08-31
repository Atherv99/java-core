class A										//2 classes,which is to be chosen for class name? //non public,so can save any file
{
	static int i;
}

class B										//non public,so can save any file
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}

//if class name is 'public class' it should be <classname.java> only.
//Ex: public class B //save as B.java
//{
//	public static void main(String[] args) 
//	{
//		System.out.println(A.i);
//	}
//}

//if class is non public can save file with any name Ex: Hello.java it will create the class files wrt the no of classes(non-public)
//present in the program. No of class files depends on classes design to respective classes in the program.
//max one class can only be public in java class.
//run the class having main() method.

//without class name we cannot use other class static member, we shud specify which other class A.i.