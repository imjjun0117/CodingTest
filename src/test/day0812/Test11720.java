package test.day0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;
		if(testCase == num.length()) {
			for(int i = 0; i < testCase; i++) {
				sum += Integer.parseInt(String.valueOf(num.charAt(i)));
			}//end for
		}//end if
		System.out.println(sum);
	}//main
	
}//class
