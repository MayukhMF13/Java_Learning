package com.mayukh.array;
import java.util.*;
public class RotationArray {
    public static void main(String[] args)
    {   int [] arr = new int [] {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rotations:");
        int n = in.nextInt();
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        for(int i = 0; i < n; i++)
        {
            int j;
            int last;
            last = arr[arr.length-1];
            for(j = arr.length-1; j > 0; j--);{
            arr[j] = arr[j-1];
        }
            arr[0] = last;
        }
        System.out.println();
        System.out.println("Array after right rotation: ");
        for(int i=0 ; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
