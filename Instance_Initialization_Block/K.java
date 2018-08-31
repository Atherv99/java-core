class K 
{ 
	    K()
	    {
		  System.out.println("K()");
		}
		{
		  System.out.println("-IIB-1");
		}
		
		K(int i)
	    { 
		 this();
		 System.out.println("K(int)");
		}
	   
	    static
		    {
		      System.out.println("-SIB 1");
			}
	    {
		  System.out.println("-IIB-2");
		}
	  
	   K(int i,int j)
	   { 
		this(j);
		System.out.println("j(int.int)");
	   }
	   static
		{
		   System.out.println("-SIB 2");
	    }
		public static void main(String[] args) 
	    {
		  K k1=new K();			
		  System.out.println("--------");

		  K k2=new K(10);
		  System.out.println("--------");

		  K k3=new K(10,20);
		  System.out.println("--------");
		}
        }

//as here all the SIB ,IIB and constructer is present in one class is called encapsulation..
