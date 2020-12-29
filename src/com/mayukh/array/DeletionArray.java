package com.mayukh.array;
import java.util.*;
public class DeletionArray {
    public static void main(String[] args)
    {
        int n, x, f = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to delete:");
        x = s.nextInt();
        int elementPos = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                f = 0;
                elementPos = i;
                break;
            }
        }
        if(f == 0)
        {
            for(int i = elementPos+1; i < n; i++)
            {
                a[i-1] = a[i];
            }
            System.out.print("After Deleting:");
            for (int i = 0; i < n-2; i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
