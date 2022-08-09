package test.day0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10871 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(stk.nextToken());
		int X = Integer.parseInt(stk.nextToken());
		int[] A = new int[N];
		stk = new StringTokenizer(br.readLine()," ");
		for(int i : A) {
			i = Integer.parseInt(stk.nextToken());
			if(i < X) {
				System.out.print(i+" ");
			}//end if
		}//end for
	}//main
}//class

