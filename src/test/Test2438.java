package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2438 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = null;
		int a = 0;
		int b = 0;
		String msg = "";
		for(; ;){
		stk = new StringTokenizer(br.readLine()," ");
		a = Integer.parseInt(stk.nextToken());
		b = Integer.parseInt(stk.nextToken());
			if(a==0 && b==0){
				break;
			}//end if
		msg += a+b+"\n";
		}//end for
		System.out.println(6/10);
	}//main
}//class

