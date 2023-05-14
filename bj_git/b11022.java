package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int testCount = 0; testCount < testCase; testCount++) {
			char[] sum = br.readLine().toCharArray();
			sb.append("Case #"+(testCount+1)+": ");
			sb.append(sum[0]+" + "+sum[2]+" = ");
			sb.append((int)(sum[0]+sum[2])-96);
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
