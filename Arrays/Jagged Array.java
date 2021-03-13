//A jagged array is one, which has different number of columns in its rows e.g if an array has 3 rows and 1st row has 2 columns, 2nd row has 3 columns and 3rd row has 1 column,
//then the array is said to be jagged Array.

package revision;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[][] arr1;				     //declaration of array 'arr1'
		arr1 = new int[2][];		             //notice it has 2 rows but number of columns is not specified
		
		//to specify columns in each row:
		
		arr1[0] = new int[3];		//3 columns in 1st row (index 0)
		arr1[1] = new int[2];		//2 columns in 2nd row (index 1)
		
		//Jagged array with initialized values
		
		int[][] arr = {{1,2,3,4},{5,6,7}}; // 1st row has 4 elements 1,2,3,4 and 2nd row has 3 elements 5,6,7
		
	}
}
