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
public class pat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(j%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                System.out.print(k);
                k++;
                }
            }
            System.out.println();
        }
    }
    
}
