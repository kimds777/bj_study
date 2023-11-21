package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24265 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(n * (n - 1) / 2 + "\n2");
		
//		long sum = 0;
//		while(n != 0) {
//			n--;
//			sum += n;
//		}
//		
//		System.out.println(sum+"\n2");
	}
}
