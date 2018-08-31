class Z4
  {
  
  static int i=test1();
  static int test1()
    {
    
    System.out.println("fron test1 ");
       
       return 10;
    }
    
    public static void main(String[] args)

      {
      
      System.out.println(i);         //here the initialiser will not execute again it will take the previos i value which assign i.e 10.
      System.out.println(test1());
      
      }


  }


