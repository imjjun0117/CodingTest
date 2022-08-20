package test.day0820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());
		int C = Integer.parseInt(stk.nextToken());
		br.close();
		if(B>=C) {
			System.out.println("-1");
			return;
		}//end if
		System.out.println(A/(C-B)+1);
	}// main

}// class
