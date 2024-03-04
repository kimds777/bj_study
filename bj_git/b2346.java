package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b2346 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 풍선 갯수 입력

		StringTokenizer st = new StringTokenizer(br.readLine()," "); // " "로 문자열 구분
		
		StringBuilder sb = new StringBuilder(); // 결과를 저장할 sb
		Deque<int[]> dq = new ArrayDeque<>(); // dq에 배열 저장 -> 배열 0번에 자연수, 1번에 풍선 안의 종이에 적힌 수
		for (int i = 1; i <= N; i++) {
			int[] arr = { i, Integer.parseInt(st.nextToken()) };
			dq.add(arr);
		}

		while (dq.size() != 1) {
			int[] arr = dq.poll(); // dq의 맨앞에 있는 배열 제거
			sb.append(arr[0] + " "); // 자연수를 sb에 저장
			int move = arr[1]; // 이동해야하는 풍선 안 종이에 적힌 수

			if (move > 0) { // 이동해야하는 숫자가 양수인 경우
				for (int i = 1; i < move; i++) {
					dq.add(dq.poll()); // dq 맨앞의 배열을 꺼내서 맨뒤에 추가
				}
			} else { // 음수인 경우
				for (int i = move; i < 0; i++) {
					dq.addFirst(dq.pollLast()); // dq 맨뒤의 배열을 꺼내서 맨앞에 추가
				}
			}
		}
		
		sb.append(dq.poll()[0]); // 마지막 자연수를 sb에 저장
		System.out.println(sb.toString());

	}
}
