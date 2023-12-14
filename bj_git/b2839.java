package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int ans = -1;

		int divFive = N / 5; //5kg 설탕 봉지 최대치
		for (int f = 1; f <= divFive; f++) {
			int modThree = (N - (5 * f)) % 3; //1 ~ 최대치를 3으로 나눈 나머지값
			if (modThree == 0) { //나머지값이 0인 경우
				ans = f + ((N - (5 * f)) / 3); //5kg 봉지 갯수와 5kg 봉지를 뺀 N을 3으로 나눈값을 더하여 입력
			}
		}
		
		if(ans == -1) { //3kg 설탕 봉지만를 가져갈 경우
			int nModThree = N % 3; //N을 3으로 나눈 나머지값
			if (nModThree == 0) { //나머지값이 0인 경우
				ans = N / 3; //3kg 봉지 갯수 입력
			}			
		}

		System.out.println(ans);
	}
}
