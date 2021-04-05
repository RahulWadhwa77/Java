/* In bubble sort algorithm, array is traversed from first element to last element. 
Here, current element is compared with the immediate next element. If current element is greater than the next element, it is swapped. */

package revision;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 1, 2, 5, 3 };	//unsorted integer type array i.e arr consisting of 5 elements.
		
		for (int i = 0; i < arr.length; i++) {
		  boolean flag = true;
		  for (int j = 0; j < arr.length - i - 1; j++) {
			  
		     if (arr[j] > arr[j + 1]) {
		       int temp = arr[j];
		       arr[j] = arr[j + 1];
		       arr[j + 1] = temp;
		       flag = false;
		     }
		   }
			
		  if (flag)
		   break;	//breaks out of for loop.
		 }
		
		for (int i = 0; i < arr.length; i++) {
	  		System.out.print(arr[i] + " ");
		}
    	}
}
