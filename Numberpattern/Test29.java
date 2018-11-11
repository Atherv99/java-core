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
public class Test29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={3,5,8,9,2,1};
        int m1=arr[0];
        int m2=arr[0];
        for(int i=1;i<arr.length;i++)
        {
                if(arr[i]>m1)
                {
                   m1=arr[i];
                   m2=m1;
                }
                if(arr[i]>m2)
                {
                    m2=arr[i];
                }
            
        }
        System.out.println("Second :"+m2);
        System.out.println("First :"+m1);
        
    }
    
}
