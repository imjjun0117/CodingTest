package test.day0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10000보다 작은 셀프넘버
 * @author imjju
 */
public class Test4673 {
	public int getCount(int n){
		int cnt = 99;
		if(n < 100){
			return n;
		}if(n == 1000) {
			return 144;
		}
		int fNum,sNum,tNum = 0;
		for(int i = 100; i <= n; i++){
			fNum = i%10;
			sNum = i/10%10;
			tNum = i/100%10;
			if((tNum-sNum)==(sNum-fNum)) {
				cnt ++;
			}//end if
		}//end for		
		return cnt;
	}//getCount	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Test4673 t = new Test4673();
		System.out.println(t.getCount(n));
	}
}// class
