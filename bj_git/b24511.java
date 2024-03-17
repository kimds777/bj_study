package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class b24511 { // Deque 활용! 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 자료구조 갯수 입력

		int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 자료구조 종류 입력
		int[] B = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 자료구조 별 원소

		int M = Integer.parseInt(br.readLine()); // 삽입할 수열의 길이 입력
		int[] C = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 삽입할 수열

		// Queue 객체 필요 but!! 자료의 마지막 삽입된 원소를 출력해야하므로 Deque 생성
		// Stack은 후입선출이므로 원소를 넣을 필요가 없다.
		Deque<Integer> queuestack = new ArrayDeque<>(); 
		for (int i = 0; i < N; i++) {
			if (A[i] == 0) { // 자료구조가 Queue인 경우
				queuestack.add(B[i]); // Queue 객체의 원소를 Deque에 넣어준다 
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			queuestack.addFirst(C[i]); // Queue는 선입선출 -> 배열 C의 원소를 맨앞에 넣으면 반복문을 사용할 필요가 없다.
			sb.append(queuestack.pollLast()+" "); // Deque에서 마지막 원소를 꺼내 sb에 저장한다.
		}

		System.out.println(sb.toString());
	}
}
