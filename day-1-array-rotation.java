// Problem statement = https://www.geeksforgeeks.org/array-rotation
// Also here = https://www.hackerrank.com/challenges/array-left-rotation/problem

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        int[] b = new int[n];

        for(int i=0, j=0; i<n; i++)
            if((d+i) < n)
                b[i] = a[d+i];
            else
                b[i] = a[j++];
                        
        for(int i=0;i<n;i++)
            System.out.print(b[i] + " ");
    }
}
