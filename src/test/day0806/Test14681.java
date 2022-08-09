package test.day0806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if((-1001<x && x<1001)&&(-1001<y && y < 1001)&&(x!=0&&y!=0)) {
			if(x>0) {
				if(y>0) System.out.println("1");
				else System.out.println("4");
			}else {
				if(y>0) System.out.println("2");
				else System.out.println("3");
			}//end else
		}//end if
	
	}//main
}//class
