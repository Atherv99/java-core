interface X
{
void test1();
}

interface Y
{
void test2();
}
 
 
 class Z
 {
 void test3()	{
 System.out.println("from test3");
 }
 }
  
  class Z1 extends Z implements X,Y
  {
  public void test1()
  {
  System.out.println("from test1");
  }


  public void test2()
  {
  System.out.println("from test2");
  }



public static void main(String[] args)
{

Z1 a=new Z1();
a.test1();

a.test2();

a.test3();

System.out.println("from");

}

  }