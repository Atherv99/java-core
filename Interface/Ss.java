interface Aa
{

void test1();

}

interface Bb
{

void test2();

}

class Ss implements Aa,Bb
{

public void test1()
{
System.out.println("done test1");
}

public void test2()
{
System.out.println("done test2");

}

public static void main(String[] args)
{

Ss obj=new Ss();
obj.test1();
obj.test2();

System.out.println("done");


}

}