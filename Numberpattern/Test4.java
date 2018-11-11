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
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
             int k=i;
            for(int j=i+1;j<n+i+1;j++)
            {
               
                if(n>=j)
                {
                System.out.print(j);
                }
                else
                {
                 System.out.print(k);
                k--;
                }
            }
            System.out.println();
        }
    }
    
}
