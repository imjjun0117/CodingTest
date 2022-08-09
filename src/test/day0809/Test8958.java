package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] result = new int[num];
		int count = 0;
		int sum = 0;
		String input = "";
		for(int i = 0; i < result.length; i++){
			input = br.readLine();
			count = 0;
			sum = 0;
			for(int j = 0; j < input.length(); j++){
				if(input.charAt(j)=='O'){
					count++;
					sum += count;
				}else{
					count = 0;
				}//end else
				result[i] = sum;
			}//end for
		}//end for
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}// main
}// class
