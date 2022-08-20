package test.day0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2908 {
	
	public static int change(String A) {
		String B = ""+A.charAt(A.length()-1);
		for(int i=1; i < A.length()-1; i++) {
			B += A.charAt(i);
		}//end for
		B += A.charAt(0);
		return Integer.parseInt(B);
	}//change
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		String A = stk.nextToken();
		String B = stk.nextToken();
		int changeA = change(A);
		int changeB = change(B);
		if(changeA > changeB) {
			System.out.println(changeA);
		} else{
			System.out.println(changeB);
		}//end else
		
	}//main
	
}//class
