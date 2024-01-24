package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < testCase; i++) {
			long n = Long.parseLong(br.readLine());
			sb.append(findNextPrime(n)); // 다음 소수 sb에 입력

			if (i != testCase - 1) { // 마지막 숫자가 아닌 경우
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());
	}

	private static long findNextPrime(long n) { // 다음 소수 찾기
        long number = n;
        while (!isPrime(number)) { // 소수가 아닌 경우 반복문 진행
            number++;
        }
        
        return number;
    }

    private static boolean isPrime(long num) {
        if (num < 2) { // 숫자가 1인 경우
            return false; // 소수가 아님
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // 숫자가 0으로 나눠지는 경우
                return false; // 소수가 아님
            }
        }
        
        return true;
    }
}
