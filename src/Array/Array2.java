package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int count = 0;
		for (int i = 0; i < 9; i++) {
			num[i] = in.nextInt();
			if (max < num[i]) {
				max = num[i];
				count = i+1;
			} // end if
		} // end for
		System.out.println(max);
		System.out.println(count);
		in.close();
	}// main

}// class
