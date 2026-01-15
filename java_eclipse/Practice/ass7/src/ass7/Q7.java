package ass7;
/*
 * Write a method that returns a new array by eliminating the duplicate values in the
array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a Java Program that reads in ten integers, invokes the method, and displays
the result.
 */
public class Q7 {
	public static int[] eliminateDuplicates(int[] arr) {
		int temp[] = new int[arr.length];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean dupe = false;
			for (int j = i; j < temp.length; j++) {
				if (arr[i] == temp[j]) {
					dupe = true;
					break;
				}
			}
			if (!dupe) { 
				temp[n] = arr[i];
				n++;
			}
		}
		int b[] = new int[n];
		for (int i = 0; i < b.length; i++) b[i] = temp[i];
		return b;
	}
	public static void main(String[] args) {

	}

}
