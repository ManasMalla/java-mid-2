/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        System.out.print("Enter the number of rows of first matrix");
        int m1 = s.nextInt();
        System.out.print("Enter the number of columns of first matrix");
        int n1 = s.nextInt();
        System.out.print("Enter the number of rows of second matrix");
        int m2 = s.nextInt();
        System.out.print("Enter the number of columns of second matrix");
        int n2 = s.nextInt();
        if(n1 != m2){
            System.out.println("The matrices can't be multiplied because of their sizes");
        }else{
            System.out.println("Resulting matrix size is " + String.valueOf(m1) + " " + String.valueOf(n2));
        }
    }
}
