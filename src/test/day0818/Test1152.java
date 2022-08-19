package test.day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1152 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		while(stk.hasMoreTokens()) {
			cnt++;
			stk.nextToken();
		}
		System.out.println(cnt);
	}//main
	
}//class
