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
public class pat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=i;
            for(int j=1;j<=i;j++)
            {
             System.out.print(k+" ");
             k=k+n-j;
            }
            System.out.println();
        }
    }
    
}