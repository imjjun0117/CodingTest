package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer stk= null;
		int max = -1000000;
		int min = 1000000;
		int temp = 0;
		stk = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<a; i++){
			temp = Integer.parseInt(stk.nextToken());
			max = max < temp ? temp : max;
			min = min > temp ? temp : min; 
		}//end for
		System.out.println(min+" "+max);
		br.close();
	}// main
}// class
