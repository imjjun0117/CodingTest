package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2480 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int c = Integer.parseInt(stk.nextToken());
		int money = 0;
		if(a==b && b==c && a==c){
			money = 10000+a*1000;
		}else if(a==b || a==c){
			money = 1000+a*100;
		}else if(b==c){
			money = 1000+b*100;
		}else{
			money = Math.max(a,Math.max(b,c))*100;
		}//end else
		System.out.println(money);
	}//main
}//class

