package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		int max = -1000000;
		int min = 1000000;
		for(int i = 0; i < num.length; i++) {
			num[i]=in.nextInt();
			if(max<num[i]) {
				max=num[i];
			}//end if
			if(min>num[i]) {
				min=num[i];
			}//end if
		}//end for
		System.out.println(min + " " + max);
		in.close();
	}// main

}// class
