package test.day0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = br.readLine().split(" ");
		int h = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
		int timer = Integer.parseInt(br.readLine());
		int sum = m+timer;
		br.close();
		if(sum >= 60){
			if(h+sum/60 > 23){
				h = (h+sum/60-24);
			}else{
				h += sum/60;
			}//end else		
			m = sum%60;
		}else{
			m += timer;
		}//end else
		System.out.println(h+" "+m);	
	}//main
}//class

