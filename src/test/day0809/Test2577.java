package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		String num = String.valueOf(a*b*c);
		int[] arr = new int[10];
		for(int i = 0; i<num.length(); i++){
			for(int j=0; j < arr.length; j++){
				if(j==Character.getNumericValue(num.charAt(i))){
					arr[j]+=1;
				}//end if
			}//end for
		}//end for
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}//end for
	}// main
}// class
