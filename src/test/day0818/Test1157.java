package test.day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1157 {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] count = new int[input.length()];
		input = input.toUpperCase();
		for(int i = 0; i < input.length();i++) {
			for(int j = i+1; j <input.length(); j++) {
				if(input.charAt(i)==input.charAt(j)) {
					count[i] += 1;
				}//end if
			}//end for
		}//end for
		int max = 0;
		int idx = 0;
		for(int i=0; i < count.length; i++) {
			if(count[i]==max && count[i]!=0) {
				System.out.println("?");
				return;
			}else if(count[i] > max) {
				max = count[i];
				idx = i;
			}//end if
		}//end for
		System.out.println(input.charAt(idx));
	}//main
	
}//class
