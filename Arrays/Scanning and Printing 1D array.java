
package com.company;

import java.util.Scanner;

public class ArrayExample {
    
    public static void main(String[] args) {

        String[] arr_string = new String[3];
        int[] arr = new int[3];

        int[] arr_with_elements = {1, 2, 3};         //elements of array already given
        int[] arr1_with_elements = new int[]{4, 5};  // another way of providing elements

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for arr_string:");
        //scanning elements of arr_string
        for (int i = 0; i < arr_string.length; i++) {       //.length return the size of array arr i.e 3
            arr_string[i] = sc.nextLine();
        }

        System.out.println("Enter elements for arr:");
        //scanning elements of arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //printing elements of arr_string
        System.out.println("Elements of arr_string:");
        for (String i : arr_string) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printing elements for arr
        System.out.println("Elements of arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printing elements of arr_with_elements
        System.out.println("Elements of arr_with_elements:");
        for(int i: arr_with_elements){
            System.out.print(i + " ");
        }
        System.out.println();
        
        //printing elements of arr1_with_elements
        System.out.println("Elements of arr1_with_elements:");
        for(int i: arr1_with_elements){
            System.out.print(i + " ");
        }
    }
}
