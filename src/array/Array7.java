package array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int rate = 0;
		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			int[] arr = new int[t];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
				sum += arr[j];
			} // end for

			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > (sum / arr.length)) {
					rate++;
				}//end if 

			} // end for
			System.out.printf("%.3f%%\n",((double) rate*100 / arr.length));
			rate=0;
			sum=0;
		} // end for
		in.close();
	}// main

}// class
