package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2587 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] findCenterValue = new int[5];
		int avg = 0;

		for (int i = 0; i < 5; i++) {
			findCenterValue[i] = Integer.parseInt(br.readLine()); // 모든 수를 배열에 넣는다.
			avg += findCenterValue[i]; // 모든 수를 미리 더해논다.
		}
		
		br.close();

		Arrays.sort(findCenterValue); // 배열을 오름차순으로 정렬

		StringBuilder sb = new StringBuilder(); // StringBuilder을 생성하여 출력할 값들을 담는다.

		sb.append(avg / 5 + "\n"); // 미리 더한 모든수를 입력갯수로 나눈다
		sb.append(findCenterValue[2]); // 5/2 = 2가 중간값이므로 findCenterValue[2]를 중간값으로 설정한다.
		
		System.out.println(sb.toString());
	}
}
