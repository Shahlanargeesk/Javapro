package Arraypkg;

import java.util.Scanner;

public class ScannerMDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size:");
      int r=sc.nextInt();
      System.out.println("Enter column size:");
      int c=sc.nextInt();
      
      int a[][]=new int [r][c];
      System.out.println("Enter the array elements:");
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
        	  a[i][j]=sc.nextInt();
        	  
          }
      
      }
      //display elements
      System.out.println("array elements:");
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
        	  System.out.print(a[i][j]+"\t");
          }
          System.out.println();
	}

	}
}
