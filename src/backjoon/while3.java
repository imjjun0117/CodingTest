package backjoon;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close(); // �Էº�

		int cycle = 0;
		int N = n; // while���� ���ǽ� ���ο� ������ �ʿ�
		do {// �ּ� 1�� ����

			n = n % 10 * 10 + ((n / 10 + n % 10) % 10); 

			cycle++; // ����Ŭ Ƚ��
		} while (N != n); //
		System.out.println(cycle);

	}// main

}// class
