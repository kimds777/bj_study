package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		if (N != 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 2; i <= Math.sqrt(N); i++) {
				while (N % i == 0) {
					sb.append(i + "\n");
					N /= i;
				}
			}

			if (N != 1) {
				sb.append(N + "\n");
			}

			System.out.print(sb);
		}
	}
}
