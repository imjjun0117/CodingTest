package test.day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test5622 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alpha = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String input = br.readLine();
		int cnt = 0;
		for(int i = 0; i < input.length(); i++) {
			for(int j=0; j < alpha.length; j++) {
				if(alpha[j].contains(String.valueOf(input.charAt(i)))){
					cnt += j+3;
					break;
				}//end if
			}//end for
		}//end for
		System.out.println(cnt);
	}//main
	
}//class
