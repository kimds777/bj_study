package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 심어진 나무 갯수 입력

		int[] trees = new int[N]; // 나무 위치를 저장할 배열
		int preTree = 0; // 이전 나무 위치
		int gcd = 0; // 최대 공약수
		for (int i = 0; i < N; i++) {
			trees[i] = Integer.parseInt(br.readLine()); // 나무 위치 저장

			if (i != 0) { // 첫번째 나무 위치가 아닌 경우
				int distance = trees[i] - preTree; // 현재 나무 위치 - 이전 나무 위치 = 나무 간격
				gcd = getGcd(gcd, distance); // 최대 공약수 계산
			}

			preTree = trees[i]; // 현재 나무 위치를 이전 나무 위치에 저장
		}

		int result = ((trees[N - 1] - trees[0]) / gcd + 1) - N; // (마지막 나무 위치 - 첫 번째 나무 위치) / 최대공약수 + 1 - 나무의 수

		System.out.println((result));

	}

	private static int getGcd(int first, int i) { // 최대 공약수를 구하는 메소드
		while (i > 0) {
			int n = i;
			i = first % i;
			first = n;
		}
		return first;
	}
}
