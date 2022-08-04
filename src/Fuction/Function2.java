package Fuction;

public class Function2 {
	
	public static int d(int number) {
		int sum = number;
		while(number != 0) {
			sum = sum+(number%10);
			number = number/10;
		}
		return sum;
	}//d
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i = 0; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {
				check[n]=true;
			}
		}//end for
		for(int i = 0; i < 10001; i++) {
			if(check[i]==false) {
				System.out.println(i);
			}//end if
		}//end for
		
	}//main

}//class
