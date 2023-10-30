package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//풀고있음!
public class b11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int p = 2;
		StringBuilder sb = new StringBuilder();
		while (N != 0) {
			if (N % p == 0) {
				sb.append(p + "\n");
				N /= p;
			} else {
				p++;
				int cnt = 0;
				int i = 2;
				while (i < p) {
					if (p % i == 0) {
						cnt++;
					}
				}

			}
		}

		System.out.println(sb);
	}
}
