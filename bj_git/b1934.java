package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCase; i++) { // testCase만큼 for문 실행
			int[] AB = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 자연수 A, B를 배열에 저장

			if (AB[0] > AB[1]) { // AB[0]이 AB[1]보다 큰수 인 경우
				getCommonMultiple(sb, AB[0], AB[1]);
			} else { // AB[0]이 AB[1]보다 작은 수 인 경우
				getCommonMultiple(sb, AB[1], AB[0]);
			}
		}

		System.out.println(sb);
	}

	private static void getCommonMultiple(StringBuilder sb, int A, int B) {
		int gdc = getGreatestCommonDiviso(A, B); // 최대 공약수
		sb.append(A * B / gdc + "\n");
	}

	private static int getGreatestCommonDiviso(int a, int b) { // 최대 공약수 구하기
		while (b != 0) { // b가 0이 아닐때까지 반복 진행 -> 유클리드 호제법 활용!
			int temp = a % b;
			a = b;
			b = temp;
		}

		return a;
	}
}
