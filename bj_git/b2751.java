package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		/*
		 * BufferedReader + Collections.sort 풀이 -> 1584	ms
		 * --------------------------------------------------------------------
		 * List<Integer> ascSort = new ArrayList<>();
		 * 
		 * for (int i = 0; i < N; i++) { ascSort.add(Integer.parseInt(br.readLine())); }
		 * 
		 * br.close();
		 * 
		 * Collections.sort(ascSort);
		 * 
		 * 
		 * for (int a : ascSort) { sb.append(a + "\n"); }
		 * --------------------------------------------------------------------
		 */
		

		// BufferedReader + Counting Sort 풀이! -> 940ms

		boolean[] ascSort = new boolean[2000001]; // 절댓값이 1,000,000보다 작거나 같은 정수라고 했으니 범위는 -1,000,000 ~ 1,000,000

		for (int i = 0; i < N; i++) {
			int inputNumber = Integer.parseInt(br.readLine()) + 1000000; // 마이너스 값도 넣어야 하므로 +1,000,000을 더한다.
			ascSort[inputNumber] = true; // boolean은 기본값이 false이다. 입력된 인덱스 번호만 true로 바꿔준다.
		}
		
		br.close();

		for (int a = 0; a < 2000001; a++) {
			if (ascSort[a]) {
				sb.append(a - 1000000 + "\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
