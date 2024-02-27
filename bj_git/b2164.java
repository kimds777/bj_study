package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 카드 수 입력

		Queue<Integer> q = new LinkedList<>(); //  맨앞에 있는 카드를 삭제하거나 뒤로 옮겨야하기 때문에 선입선출인 Queue 사용 
		for (int i = 1; i <= N; i++) { // 순서대로 카드를 저장
			q.add(i);
		}

		while (q.size() != 1) { // Queue의 크기가 1이 아닐때까지 반복
			q.poll(); // 맨앞의 카드 버리고
			q.add(q.poll()); // 그뒤에 카드를 맨뒤로 옮긴다.
		}
		
		System.out.println(q.peek()); // 마지막 남은 카드 출력
	}
}
