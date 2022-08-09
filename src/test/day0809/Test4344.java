package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = null;
		int testCaseChild = 0;
		StringTokenizer stk = null;
		for(int i = 0; i < testCase; i++) {
			stk = new StringTokenizer(br.readLine()," ");
			testCaseChild=Integer.parseInt(stk.nextToken());
			arr = new int[testCaseChild];
			double sum =0;
			for(int j=0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(stk.nextToken());
				sum += arr[j];
			}//end for
			double avg = sum/testCaseChild;
			double cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j]>avg) {
					cnt ++;	
				}//end if
			}//end for
			System.out.printf("%.3f%%\n",cnt*100/testCaseChild);
		}//endfor
	}// main
}// class
