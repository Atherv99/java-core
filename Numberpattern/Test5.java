/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberpattern;
import java.util.*;
/**
 *
 * @author Ashwani Kumar
 */
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<n;i++)
        {
            int k=2;
            for(int j=i+1;j<=n+i;j++)
            {
              if(n>=j)
              {
                  System.out.print(j);
                  
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
