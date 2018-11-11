/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberpattern;
import static java.lang.Math.pow;
import java.util.*;
import java.math.*;
/**
 *
 * @author Ashwani Kumar
 */
public class p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
         odd(n/2);
        }
        else
        {
         even(n/2+1);
        }
    }
    static void odd(int n)
    {
      int i,x;
      for(i=0;i<50;i++)
      {
        x= (int) pow(3,i);
        if(i==n)
        {
            System.out.print(x+"");
        }
      }
    }
    static void even(int n)
    {
       int i,x;
      for(i=0;i<50;i++)
      {
        x= (int) pow(2,i);
        if(i==n)
        {
            System.out.print(x+"");
        }
      } 
       System.out.println();
    }
   
}
