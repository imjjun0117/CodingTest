package test.day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2675 {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer stk = null;
		int R = 0;
		String S = "";
		String result = "";
		for(int i = 0; i < T; i++) {
		 stk = new StringTokenizer(br.readLine()," ");
		 R = Integer.parseInt(stk.nextToken());
		 S = stk.nextToken();
		 for(int j = 0; j < S.length(); j++) {
			 for(int k = 0; k < R; k++) {
			 result += S.charAt(j);
			 }//end for
		 }//end for
		 result += "\n";
		}//end for
		System.out.println(result);
	}//main
	
}//class
