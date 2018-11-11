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
public class Test13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(".........................");
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
