package revision;

import java.util.*;

public class ArrayExample {
	
    public static void main(String[] args) {

        String[][] arrS = new String[2][3];				//String array of 2 rows and 3 columns
        int[][] arrI = new int[2][2];					//Integer array of 2 rows and 2 columns

	Scanner sc = new Scanner(System.in);

        //Scanning elements of arrS
        System.out.println("Enter elements for arrS:");
        for(int i = 0;i < arrS.length;i++) {
        	for(int j=0;j<arrS[i].length;j++) {
        		arrS[i][j] = sc.nextLine();
        	}
        }

        //Scanning elements of arrI
        System.out.println("Enter elements for arrI:");
        for(int i = 0;i < arrI.length;i++) {
        	for(int j=0;j<arrI[i].length;j++) {
        		arrI[i][j] = sc.nextInt();
        	}
        }

        //printing elements of arrS
        System.out.println("Elements of arrS:");
        for(int i=0;i<arrS.length;i++) {
		for(int j=0;j<arrS[i].length;j++) {
			System.out.print(arrS[i][j] + " ");
		}
		System.out.println();
	}
        
        //printing elements of arrI
        System.out.println("\nElements of arrI:");	// '\n' places cursor in the next line
        for(int i=0;i<arrI.length;i++) {
		for(int j=0;j<arrI[i].length;j++) {
			System.out.print(arrI[i][j] + " ");
		}
		System.out.println();
	}
       sc.close();
    }
}
