package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Stream;

public class b12789 { // 수정필요!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] students = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		String ans = "Nice";
		Stack<Integer> line = new Stack<>();
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N; j++) {
				if (students[N - 1] == 0) {
					
					if (line.peek() != i) {
						ans = "Sad";
					}else {
						line.pop();						
					}
					
					break;
				}else if (students[j] != i && students[j] != 0) {
					line.push(students[j]);
					students[j] = 0;
				} else if (students[j] == i) {
					students[j] = 0;
					break;
				}
			}
		}

		System.out.println(ans);
	}
}
