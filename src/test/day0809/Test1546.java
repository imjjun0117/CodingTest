package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] scores = new int[cnt];
		double max = 0;
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < cnt; i++) {
			int score = Integer.parseInt(stk.nextToken());
			max = max < score ? score : max;
			scores[i] = score;
		}//end for
		double sum = 0;
		for(int i = 0; i < cnt; i++) {
			sum += scores[i]*100/max;
		}//end for
		System.out.println(sum/cnt);
	}// main
}// class
