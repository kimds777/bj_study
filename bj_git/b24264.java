package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		System.out.print((long) Math.pow(n, 2) + "\n2");
	}
}
