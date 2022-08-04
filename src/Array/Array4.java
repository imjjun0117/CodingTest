package Array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = 0;
			arr[i] = in.nextInt() % 42;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					a++;
				} // end if
			}//end for
			if (a==0) {
				count++;

			}//end if

		} // end for
		System.out.println(count);
		in.close();
	}// main
}// class
