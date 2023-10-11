package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rest {
	public void print(int tc) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < tc; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append(temp / 25 + " ");
			temp %= 25;

			sb.append(temp % 10 + " ");
			temp %= 10;

			sb.append(temp % 5 + " ");
			temp %= 5;

			sb.append(temp + " ");
		}
		
		System.out.println(sb);

	}
}

public class b2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int[] coins = { 25, 10, 5, 1 };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			int temp = Integer.parseInt(br.readLine());
			for (int j = 0; j < coins.length; j++) {
				sb.append(temp / coins[j] + " ");
				temp %= coins[j];
			}
			sb.append("\n");
		}

		br.close();

		System.out.println(sb);

	}
}
