package array;
import java.util.Scanner;

public class Array3_2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[10];
		int count=0;
		int samecount=0;
		for (int i=0; i<array.length; i++) {
			array[i]=(sc.nextInt()%42);					
		}//end for
		
		for (int i=0; i<array.length; i++) {
			samecount=0;
			for(int j=i+1; j<array.length;j++) {
				if(array[i]==array[j]) {
					samecount++;
				}//end if
			}//end for
			if(samecount==0) {
				count++;
			}// end if
		}//end for
		System.out.println(count);
		
	}//main

}//class

