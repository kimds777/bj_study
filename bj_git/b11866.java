package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class b11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NK = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // NK[0]: 사람 수, NK[1]: 제거되는 순서

		Queue<Integer> q = new LinkedList<>(); // 큐 생성 1번부터 N번까지 숫자 저장
		for (int i = 1; i <= NK[0]; i++) {
			q.add(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (q.size() > 1) { // 큐에 숫자가 하나 남아있는 경우 반복 종료
			for (int i = 0; i < NK[1] - 1; i++) { // K번째 사람을 제거해야하기 때문에 NK[1]-1 
				int val = q.poll(); // 맨앞의 번호 꺼내고 삭제
				q.add(val); // 맨앞의 번호를 맨뒤로 보낸다.
			}
			
			sb.append(q.poll()+", "); // 제거된 K번째 사람을 sb에 기록
		}
		
		sb.append(q.poll()+">"); // 마지막 남은 사람을 꺼내 sb에 기록
		System.out.println(sb.toString());
	}
}
