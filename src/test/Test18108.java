package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��Ģ����
 * @author imjju
 */
public class Test18108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		String b =br.readLine();
		br.close();
		int bNum = Integer.parseInt(b);//�Է¹��� B�� int��
		int num = 10; // ���� ����
		
		for(int i = 0; i < b.length(); i++) {
			System.out.println(a*(bNum%num/(num/10)));
			num *= 10;
		}//end for
		System.out.println(a*bNum);
	}//main
}//class
