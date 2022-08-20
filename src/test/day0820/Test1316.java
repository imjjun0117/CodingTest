package test.day0820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = "";
		int cnt = N;
		boolean chk = false;
		for (int i = 0; i < N; i++) {
			input = br.readLine();
			chk = false;
			for (int j = 0; j < input.length(); j++) {
				for (int k = j + 1; k < input.length(); k++) {
					if(input.charAt(j)==input.charAt(k) && k-j==1) {
						break;
					}
					if (input.charAt(j) == input.charAt(k) && k - j > 1) {
						cnt--;
						chk = true;
						break;
					} // end if
				} // end for
				if (chk) {
					break;
				} // end if
			} // end for
		} // end for
		br.close();
		System.out.println(cnt);
	}// main

}// class
