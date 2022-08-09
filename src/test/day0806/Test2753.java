package test.day0806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		if(year > -1 && year < 4001) {
			System.out.println((year%400)==0? "1":(year%100)==0?"0":(year%4)==0?"1":"0");
		}
	}// main
}// class
