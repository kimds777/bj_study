package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 응시한 학생 수
		int k = Integer.parseInt(st.nextToken()); // 상을 받는 학생 수

		List<Integer> student = new ArrayList<>(); // 응시한 학생의 점수를 담을 리스트

		st = new StringTokenizer(br.readLine(), " "); // 응시한 학생들의 점수를 분리
		
		br.close();

		for (int i = 0; i < N; i++) {
			student.add(Integer.parseInt(st.nextToken())); // 리스트에 학생들의 점수를 넣는다.
		}

		Collections.sort(student, Collections.reverseOrder()); // 점수를 담은 리스트를 내림차순으로 정렬

		System.out.println(student.get(k - 1)); // K번째 학생 점수 출력
	}
}
