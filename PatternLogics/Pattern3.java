//image under imgs directory with same name i.e Pattern3

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        int u = n - (n / 2);
        int l = n / 2;
        while(i <= u){
            int sp = 1;
            while(sp <= u - i){
                System.out.print(" ");
                sp++;
            }
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while(j <= i - 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while(i <= l){
            int sp = 1;
            while(sp <= i){
                System.out.print(" ");
                sp++;
            }
            int j = 1;
            while(j <= l - (i - 1)){
                System.out.print("*");
                j++;
            }
            j = 1;
            while(j <= l - i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
