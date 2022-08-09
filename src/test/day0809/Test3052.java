package test.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[10];
		int num = 10;
		for(int i = 0; i< a.length; i++){
			a[i] = Integer.parseInt(br.readLine())%42; 
		}//end for	
		for(int i = 0; i< a.length; i++){
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					a[i] = -1;
				}//end if
			}//end for
			if(a[i]==-1) {
				num --;
			}
		}//end for	
		br.close();
		System.out.println(num);
	}// main
}// class
