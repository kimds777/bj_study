package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int kind = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0;i<kind;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");	
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum += a * b;
		}
		String result = total==sum?"Yes":"No";
		System.out.println(result);
	}
}
