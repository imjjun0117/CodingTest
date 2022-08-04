package Array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ox = "";
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			ox = in.next();
			for (int k = 0; k < ox.length(); k++) {
				if (ox.charAt(k) == 'O') {
					count++;
					sum += count;
				} else{
					count = 0;
				} // end else
			} // end for
			System.out.println(sum);
			sum = 0;
			count=0;
		} // end for
		in.close();
	}// main

}// class
