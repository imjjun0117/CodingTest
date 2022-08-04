package Array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		int sub = a * b * c;
		String s = sub + "";
		int[] count = new int[10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) - '0') == i) {
					count[i] += 1;
				} // end if
			} // end for
			System.out.println(count[i]);
		} // end for
	}// main

}// class
