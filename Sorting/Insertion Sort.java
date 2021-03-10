package revision;

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {18, 11, 9, 3, 5};
		
		for(int i = 1;i < arr.length;i++){
            	   int temp = arr[i];
                   int j = i;
                   while(j > 0 && arr[j-1]>temp){
                	arr[j] = arr[j-1];
                	j--;
            	   }
            	   arr[j] = temp;	
        	} 
		
		System.out.println("\nFinal Sorted array: ");
		System.out.println(Arrays.toString(arr));
	}
}
