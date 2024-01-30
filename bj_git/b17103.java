package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17103 {

	private static boolean[] isPrimes = getPrimes();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCase; i++) {
			int number = Integer.parseInt(br.readLine());

			sb.append(getCount(number));
			if (i < testCase - 1) {
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());
	}

	private static boolean[] getPrimes() {
		boolean[] arr = new boolean[1000001];
		for (int i = 2; i < arr.length; i++) {
			if (!arr[i]) {
				for (int j = i * 2; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}
		return arr;
	}

	private static int getCount(int number) {
		int count = 0;
		for (int j = 2; j <= number / 2; j++) {
			if (!isPrimes[j] && !isPrimes[number - j]) {
				count++;
			}
		}

		return count;
	}
}
