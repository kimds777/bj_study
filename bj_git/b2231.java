package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int ans = 0;
		for (int i = 1; i < N; i++) {
			int number = i;

			int modSum = 0;
			while (number > 0) {
				modSum += number % 10;
				number /= 10;
			}

			if (modSum + i == N) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
	}
}
