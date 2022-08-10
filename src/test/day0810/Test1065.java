package test.day0810;

/**
 * 10000보다 작은 셀프넘버
 * @author imjju
 */
public class Test1065 {
	
	public int getSelfNum(int num) {
		int sum = num;
		do{
			sum += num % 10;
			num /= 10;
		}while(num != 0);
		return sum;
	}//getSelfNum

	public void print(){
		boolean[] check = new boolean[10001];
		for(int i = 1; i < check.length; i++){
			if(getSelfNum(i) < 10001){
				check[getSelfNum(i)]=true;
			}//end if
		}//end for
		for(int i = 1; i < check.length; i++){
			if(!check[i]){
				System.out.println(i);
			}//end if
		}//end for
	}//print
	public static void main(String[] args) {
		Test1065 t = new Test1065();
		t.print();
	}
}// class
