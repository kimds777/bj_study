package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class b2346 { // 수정필요!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 풍선 갯수 입력

		StringBuilder sb = new StringBuilder();
		Deque<int[]> dq = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			int[] arr = { i, Integer.parseInt(br.readLine()) };
			dq.add(arr);
		}

		while (dq.size() != 1) {
			int[] arr = dq.poll();
			sb.append(arr[0] + " ");
			int move = arr[1];

			if (move > 0) {
				for (int i = 1; i < move; i++) {
					dq.add(dq.poll());
				}
			} else {
				for (int i = move; i < 0; i++) {
					dq.add(dq.pollLast());
				}
			}
		}
		
		sb.append(dq.poll()[0]);
		System.out.println(sb.toString());

	}
}
