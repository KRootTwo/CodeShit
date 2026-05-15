package test;

import java.util.Arrays;

public class T1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] brr = new int[5];
		
		brr = arr;
		
		System.out.println(Arrays.toString(brr));
		
		brr[2] = 67;
		
		System.out.println(Arrays.toString(brr));
		System.out.println(Arrays.toString(arr));
		
	}

}
