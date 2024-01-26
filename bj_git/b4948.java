package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4948 {
	// 에라토스테네스의 체 알고리즘 활용! -> 172ms
	private static boolean[] prime = new boolean[246913];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		getPrime();

		StringBuilder sb = new StringBuilder();
		while (true) {
			int temp = Integer.parseInt(br.readLine());

			if (temp == 0) {
				break;
			}

			sb.append(getCountPrime(temp) + "\n");

		}

		System.out.println(sb.toString());
	}

	private static void getPrime() {
		prime[0] = prime[1] = true;
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i]) {
				continue;
			}
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

	private static int getCountPrime(int number) {
		int count = 0;
		for (int i = number + 1; i <= number * 2; i++) {
			if (!prime[i]) {
				count++;
			}
		}
		return count;
	}

//	Math.sqrt 활용! -> 1004ms
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringBuilder sb = new StringBuilder();
//		while (true) {
//			int temp = Integer.parseInt(br.readLine());
//
//			if (temp == 0) {
//				break;
//			}
//			
//			sb.append(countPrime(temp) + "\n");
//
//		}
//
//		System.out.println(sb.toString());
//	}
//
//	private static boolean isPrime(int number) {
//		for (int i = 2; i <= Math.sqrt(number); i++) {
//			if (number % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	private static int countPrime(int number) {
//		int count = 0;
//		for (int i = number + 1; i <= number * 2; i++) {
//			if (isPrime(i)) {
//				count++;
//			}
//		}
//		return count;
//	}
}
