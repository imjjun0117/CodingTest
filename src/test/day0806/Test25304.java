package test.day0806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test25304 {
	public static void main(String[] args) throws IOException{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = null;
		int sum = 0;
		for(int i = 0; i < N; i++){
			stk = new StringTokenizer(br.readLine()," ");
			sum += Integer.parseInt(stk.nextToken())*Integer.parseInt(stk.nextToken());
		}
		if(sum == X) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}//end else
	}//main
}//class

