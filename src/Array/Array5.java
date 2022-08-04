package Array;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] score = new double[n];
		double max = 0;
		double sum = 0;
		for(int i = 0 ; i < score.length; i++) {
			score[i]=in.nextDouble();
			if(max < score[i]) {
				max=score[i];
			}//end if
		}//end for
		for(int j = 0; j < score.length; j++) {
			score[j]=score[j]*100/max;
			sum+=score[j];
		}//end for
		System.out.println(sum/score.length);
		in.close();
	}//main

}//class
