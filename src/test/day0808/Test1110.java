package test.day0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1110 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = a;
		int cnt = 0;		
		do{
			if((a/10+a%10)>9){
				a = a%10*10+(a/10+a%10)%10;
			}else{
				a = a%10*10+a/10+a%10;
			}//end else
			cnt ++;
		}while(!(a==b));
		System.out.println(cnt);
	}//main
}//class

