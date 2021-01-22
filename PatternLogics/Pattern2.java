//image given in imgs directory with same file name "Pattern2"

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n){
            int sp = 1;
            while(sp <= n - i){
                System.out.print(" ");
                sp++;
            }
            int j = 1;
            int c = i;
            while(j <= i){
                System.out.print(c);
                c++;
                j++;
            }
            j = 1;
            int k = 2 * (i-1);
            while(j <= i - 1){
                System.out.print(k);
                k--;
                j++;
            }
            System.out.println();
            i++;
        }
	}

}
