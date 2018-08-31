class Manager22 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		B b1 = (B) a1;//B object is type of A as it contains members of B as well A. B object is instance of B,instance of A. B object doesn't have 
		//any instance of C or memebers of C
		System.out.println("---------");
		A a2 = new A();
		B b2 = (B) a2;//RTE,compiler is checking for reference.
		System.out.println("---------");
	}
}
//Object of B can't be converted into C or D as its not having C type members,if you try to convert it throws RTE
//(B) a1 in Run time environment will check where a1 is pointing, its pointing to B object,which is contating B members,it can be converted.
//(B) a2;in Run time environment will check where a2 is pointing,its pointing to A object, which is containig A members(it doesn't have B members),
//it can't be converted to B so RTE.
//while running the Run Time Environment will chk object not checking for reference type.
//compiler willl always check for reference type(data type of reference) doesn't care for object.
//Run Tiime Environment will always check for object type not reference type.