package test.day0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9489 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		if (score < -1 || score > 100) {
			System.out.println("잘못된 입력입니다.");
			return;
		} // end if
		String grade = "F";
		int a = score/10;
		switch (a) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		}// end switch
		System.out.println(grade);
	}// main
}// class
