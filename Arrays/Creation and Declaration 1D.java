package revision;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] arr1;			//declaration of array named 'arr1' of type int
		arr1 = new int[3];		//creation of array with size 3
		
		//the above can be done in a single line
		int[] arr2 = new int[3];
		char[] arr3 = new char[3];	//array 'arr3' of character type with size 3
						//similarly data types can be changed depending upon the type of data needed to be stored
		
		/* the default value of various types of data is:
		 * numeric primitive type = 0
		 * boolean = false
		 * non primitive i.e String = null
		 */
				
		//creating an array with values aka elements
		
		int arr4[] = {1,2,3,4,5};		//array 'arr4' of type int has size 5
		//or
		int arr5[] = new int[] {6,7,8,9,10};    // array 'arr5' of type int has size 5
		
		//some points to remember
		/* int []a, b; -- both 'a' and 'b' are arrays
		 * int c[], d; -- 'c' is array but 'd' is an int variable
		 * int[] e = new int[5],f = new int[8]; --'e' is an int array with size 5 and 'f' is an int array with size 8
		 */
	}
}
