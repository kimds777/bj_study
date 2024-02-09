package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b13909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int i = 1; i * i <= N; i++) { // N번째 창문이 열려있으려면 닫은 횟수가 홀수여야한다. -> 약수가 홀수인것은 제곱 수
			cnt++;
		}

		System.out.println(cnt);

	}
}
