class Z
{

static int i=test();  // here the zero is assign first at class loading time,so it will give zero value.
static int j=10;
static int test()
{


return j;

}
public static void main(String... args)
{

System.out.println(i);
System.out.println(j);

}

}


//we r geting 0 and 10 because  all glbl memory storing in memory so it will store default value. after the execution only the value is assign.