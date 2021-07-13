package test;
import java.io.*;
import java.util.*;

public class Pattern {
	public static void main(String args[]){  
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("enter input");
		 	int n = sc.nextInt();
		 	int a[][] = new int[n][n];
		 	int k = n*n;
		 	for(int i =0; i<n ;i++)
		 	{
		 		for(int j =0; j<n; j++)
		 		{
		 				a[i][j] = k;
		 				System.out.print(k + " ");
			 			k = k -1;
		 		}
		 		System.out.println();	
		 	}
		 	
		 	
		 } 
}
