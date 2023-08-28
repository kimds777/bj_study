package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9086 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < testCase; i++) {
			String str = br.readLine();
			int length = str.length();
			sb.append(str.charAt(0)).append(str.charAt(length-1)).append("\n");
		}
		
		br.close();
		
		System.out.println(sb.toString());

	}
}
