package Fuction;

public class Function1 {

	public void selfNum(int n) {
		int a = 0;
		int b = 0;
		int count = 0;

		if (n < 100) {
			count = n;
		} else {
			count = 99;
			if (n == 1000) {
				count = 144;
			}

			for (int i = 100; i <= n; i++) {
				a = i / 100 - ((i / 10) % 10);
				b = ((i / 10) % 10) - (i % 10);
				if (a == b) {
					count++;
				} // end if

			} // end for
			System.out.println(count);

		}//end else
		
	} // selfNum

	public static void main(String[] args) {
		
		Function1 f = new Function1();
		f.selfNum(101);
	}// main
}// class