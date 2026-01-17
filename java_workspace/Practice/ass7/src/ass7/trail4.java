package ass7;

import java.util.Arrays;

public class trail4 {
	public static int[] elmDupes(int [] arr) {
		int [] temp = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean dupe = false;
			for (int j = 0; j < temp.length; j++) {
				if (arr[i] == temp[j]) {
					dupe = true;
					break;
				}
			}
			if (!dupe) {
				temp[count] = arr[i];
				count++;
			}
		}
		int [] rs = new int[count];
		for (int i = 0; i < rs.length; i++) rs[i] = temp[i];
		return rs;
	}
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 2, 1};
		System.out.println(Arrays.toString(elmDupes(arr)));
	}

}
