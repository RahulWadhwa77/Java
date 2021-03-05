package revision;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3,5,2,1,4};	//Integer type array i.e arr of size 5
		
		boolean flag = false;
		int findElement = 1;			//Element to be searched.
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == findElement) {     //in case of String/char type use .equals()
				System.out.println("Element '"+findElement+"' is at index: "+i);
				flag = true;
				break;
			}
		}
		
		//If element not found then:
		if(!flag) {
			System.out.println("Element not found");
		}
	}
}
