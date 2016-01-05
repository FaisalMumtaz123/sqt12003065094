/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Faisal
 */

import java.util.Scanner;
public class Project {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        
                    Scanner scan = new Scanner( System.in );        


            int n, i;    

            /* Accept number of elements */

            System.out.println("Enter number of integer elements");

            n = scan.nextInt();    

            /* Make array of n elements */

            int arr[] = new int[ n ];

            /* Accept elements */

            System.out.println("\nEnter "+ n +" integer elements");

            for (i = 0; i < n; i++)

                arr[i] = scan.nextInt();

            /* Call method sort */
heap he=new heap();
he.sort(arr);
            
            /* Print sorted Array */

            System.out.println("\nElements after sorting ");        

            for (i = 0; i < n; i++)

                System.out.print(arr[i]+" ");            

            System.out.println();            

        }    

    }


        
        
        
        
   
    

