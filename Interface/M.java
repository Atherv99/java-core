interface K
{
void test1();
}

interface L extends K
{
void test2();
}
 class M implements L
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

M a=new M();
a.test1();

a.test2();


System.out.println("from");

}

  }