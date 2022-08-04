package backjoon;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close(); // 입력부

		int cycle = 0;
		int N = n; // while문의 조건식 새로운 변수가 필요
		do {// 최소 1번 수행

			n = n % 10 * 10 + ((n / 10 + n % 10) % 10); 

			cycle++; // 사이클 횟수
		} while (N != n); //
		System.out.println(cycle);

	}// main

}// class
