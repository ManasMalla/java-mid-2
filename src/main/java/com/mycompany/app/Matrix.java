package com.mycompany.app;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // s.useDelimiter("\n");
        System.out.print("Enter the number of rows of first matrix: ");
        int m1 = s.nextInt();
        System.out.print("Enter the number of columns of first matrix: ");
        int n1 = s.nextInt();
        System.out.print("Enter the number of rows of second matrix: ");
        int m2 = s.nextInt();
        System.out.print("Enter the number of columns of second matrix: ");
        int n2 = s.nextInt();
        if(n1 != m2){
            System.out.println("The matrices can't be multiplied because of their sizes");
        }else{
            int[][] answer = new int[m1][n1];
			System.out.println("Input the matrix");
            int[][] a = new int[m1][m2];
            for(int i = 0; i < m1; i++){
                for (int j = 0; j < n1 ; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            int[][] b = new int[m2][n2];
            for(int i = 0; i < m2; i++){
                for (int j = 0; j < n2 ; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    int sum = 0;
                    for (int k = 0; k < n1; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    answer[i][j] = sum;
                }
            }
            System.out.println("The answer of the given matrix multiplication is: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(String.valueOf(answer[i][j]) + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
