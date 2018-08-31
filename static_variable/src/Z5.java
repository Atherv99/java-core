class Z5
  {
  
  static int i=test1();
  static int test1()
    {
    
    System.out.println("fron test1 ");
       main(null);      // here we are calling main method exlpicitly.By this we call execute main method explitly before main method.
       return 10;
    }
    
    public static void main(String[] args)

      {
      
      System.out.println("from main");
      System.out.println(i);
      
      
      }


  }


  // we can call main methd any no of times.