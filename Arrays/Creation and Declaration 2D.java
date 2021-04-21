package revision;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int[][] arr1;				    //declaration of array named 'arr1' of type int
		arr1 = new int[2][3];		            //creation of array with 2 rows having 3 columns each
		
		//the above can be done in a single line
    
		int[][] arr2 = new int[2][3];
		char[][] arr3 = new char[3][3]; 	//array 'arr3' of character type with 3 rows and 3 columns
							//similarly data types can be changed depending upon the type of data needed to be stored

		/* if number of rows equals number of columns then it is said to be matrix array */
		
		//creating array with initialized values.
    
		int [][] arr4 = {{1,2,3},{4,5,6}};    //First row has elements 1,2,3 and Second row has 4,5,6
		//or
		int[][] arr5 = new int[][] {{7,8},{9,10}};
		
		/*Some important points:
		 * int[][] a,b; -- both 'a' and 'b' are 2D arrays
		 * int[] a[],b; -- 'a' is 2D but 'b' is 1D array
		 * int[][]a,[]b; - error 
		 */
	}
}
