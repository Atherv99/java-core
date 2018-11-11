/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberpattern;

/**
 *
 * @author Ashwani Kumar
 */
public class pat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
       
        for(int i=1;i<=n;i++)
        {
             int k=i;
            for(int j=1;j<=2*i-1;j++)
            {
                
                if(j<=i)
                {
               System.out.print(j);
                }
                else
                {
                    System.out.print(k);
                }
            }
           
            System.out.println();
        }
    }
    
}
/*
run:
1
121
12321
1234321
123454321
BUILD SUCCESSFUL (total time: 0 seconds)


*/
