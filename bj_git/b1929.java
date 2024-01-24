package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] MN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // M과 N을 입력받는다.

		StringBuilder sb = new StringBuilder();
		for (int i = MN[0]; i <= MN[1]; i++) {
			if (isPrime(i)) { // 소수인 경우
				sb.append(i); // sb에 넣는다.
				
				if (i != MN[1]) {
					sb.append("\n");
				}
			}
		}
		
		System.out.println(sb.toString());
	}

	private static boolean isPrime(int number) { // 소수인지 확인하는 메소드
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
