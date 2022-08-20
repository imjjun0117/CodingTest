package test.day0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		input = input.toUpperCase();
		br.close();
		int max= 0;
		int idx = 0;
		int[] cnt = new int[26];
		int idx2=0;
		int idx3=0;
		for(int i =0; i < input.length(); i++) {
			idx2=input.charAt(i)-65;
			cnt[idx2]++;
			if(cnt[idx2]>max) {
				max = cnt[idx2];
				idx = i;
				idx3= idx2;
			}
		}//end for
		for(int i = 0; i < cnt.length; i++) {
			if(i != idx3 && max==cnt[i]) {
				System.out.println("?");
				return;
			}//end if
		}//end for
		
		System.out.println(input.charAt(idx));
	}// main

}// class
