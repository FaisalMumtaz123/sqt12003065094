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
public class heap {
          private static int N;
public static void sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     

    /* Function to build a heap */   

    public static void heapify(int arr[])
    {
N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
 if (left <= N && arr[left] > arr[i])
     max = left;
   if (right <= N && arr[right] > arr[max])        
            max = right;
if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);

        }

    }    

    /* Function to swap two numbers in an array */

    public static void swap(int arr[], int i, int j)

    {

        int tmp = arr[i];

        arr[i] = arr[j];

        arr[j] = tmp; 

    }
}
