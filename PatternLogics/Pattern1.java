//image given in imgs directory with same file name "Pattern1"

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter number of rows:");
        	int n = sc.nextInt();     //number of lines.  
        	int i = 1;
        	while(i <= n){
            		int sp = 1;
            		while(sp <= n - i){
                		System.out.print(" ");
                		sp++;
            		}
            		int j = n - (i - 1);
            		while(j <= n + (i -1)){
                		System.out.print("*");
                		j++;
            		}
            		i++;
           	 System.out.println();
        	}
	}
}
