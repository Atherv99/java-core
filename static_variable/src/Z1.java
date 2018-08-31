class Z1
{
static int i=test();
static int test()
    {
    
    System.out.println("fron test ");
     return 10;
    }

    public static void main(String[] args)
       {
       System.out.println("main begin ");
       System.out.println(i);
       System.out.println("main end ");
       
       
       }

}

//whenever class is loadind every static memeber aare atoring then exesute initialiser one by one from top to bottom.

//initialy the i store the mmory zero only.

//first execut initialier from top to bolltom

//ater that the metod will execude.


// when ever class is lodind all static menber will also loading.
// one claass will loading at one time for entire execution.

// loading consist of two methos storing and then execute.

// first all the initialiser will execute after that only main is loadig.


// first class loading then static global memeber is loading with default value
// then staic member will be assign with there assign value.
// Third main methed is execute.


