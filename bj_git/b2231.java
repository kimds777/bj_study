package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2231 { //수정해야함
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int maxMinus = 0, temp, minus, ans = N;
		while (true) {
			temp = ans - maxMinus;
			minus = 0;

			while (temp > 0) {
				System.out.println(temp);
				minus += temp % 10;
				temp /= 10;
			}

			if (maxMinus + minus > 27) {
				break;
			}

			maxMinus += minus;
			int ansTemp = ans - maxMinus;
			int ansSum = 0;

			while (ansTemp > 0) {
				ansSum += ansTemp % 10;
				ansTemp /= 10;
			}

			if (ansSum == minus) {
				ans = ansTemp;
			}
		}

		if (N == ans) {
			ans = 0;
		}

		System.out.println(ans);
	}
}
