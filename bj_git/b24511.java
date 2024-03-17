package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Stream;

public class b24511 { // 시간 초과!! 수정필요!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		List<Collection<Integer>> queuestack = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			if (A[i] == 0) {
				Queue<Integer> que = new LinkedList<>();
				que.add(B[i]);

				queuestack.add(que);
			} else {
				Stack<Integer> stack = new Stack<>();
				stack.add(B[i]);

				queuestack.add(stack);
			}
		}

		int M = Integer.parseInt(br.readLine());
		int[] C = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int retrunValue = C[i];
			for (int j = 0; j < N; j++) {
				
				if(A[j] == 0) {
					Queue<Integer> que = (Queue<Integer>) queuestack.get(j);
					que.add(retrunValue);
					
					retrunValue = que.poll();					
				}else {
					Stack<Integer> stack = (Stack<Integer>) queuestack.get(j);
					stack.add(retrunValue);
					
					retrunValue = stack.pop();
				}
			}
			
			sb.append(retrunValue+" ");
		}
		
		System.out.println(sb.toString());
	}
}
