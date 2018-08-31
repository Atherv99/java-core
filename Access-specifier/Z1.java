class Z1 
{
	final int i;

	Z1()
	{
		i = 10;
	}

	Z1(int i)
	{
		this.i = i;			//local and global non static having same name then use this as to differentiate this.i=global, i = local
	}						//argu i assining to globla i.
}