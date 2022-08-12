package test.day0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10809 {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char c = 0;
		int result = 0;
		for(int i = 97; i < 123; i++) {
			c = (char)i;
			result = -1;
			for(int j = 0; j < s.length(); j++) {
				if(c == s.charAt(j)) {
					result = j;
					break;
				}//end if
			}//end for
			System.out.print(result+" ");
		}//end for
	}//main
	
}//class
