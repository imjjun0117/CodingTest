package backjoon;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class work  {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		bw.write(Integer.parseInt(st.nextToken())+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
