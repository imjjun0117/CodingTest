package test.day0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++){
			for(int j = N-i; j >=1; j--){
				System.out.print(" ");
			}//end for
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}//end for
			System.out.println();
		}//end for
	}//main
}//class

