package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2884 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
		int h = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
        br.close();
        if(m>=45) {
        	m -= 45;
        }else if(h==0) {
        	h += 23;
        	m = 60-(45-m);
        }else {
        	h -=1;
        	m = 60-(45-m);
        }//end else
        
		System.out.println(h+" "+m);
	}//main
}
