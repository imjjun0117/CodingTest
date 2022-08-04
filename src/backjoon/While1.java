package backjoon;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				} // end else
			} // end for
			System.out.println();
		} // end for
	}// main

}// class
