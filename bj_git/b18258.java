package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Queue<String> q = new LinkedList<>(); // 큐 생성
		StringBuilder sb = new StringBuilder(); // 출력할 결과를 저장할 sb
		String last = ""; // 큐의 가장 마지막에 들어간 정수
		while (N-- > 0) { // N이 0보다 클때까지만 반복
			
			String[] strArr = br.readLine().split(" "); // 문자열을 " "로 분리

			switch (strArr[0]) { // 배열의 0번째 문자열을 기준으로 실행
			case "push": // 정수를 큐에 넣는다
				q.add(strArr[1]);
				last = strArr[1]; // 가장 마지막에 큐에 저장된 문자열
				break;
				
			case "pop": // 큐의 맨앞에 있는 문자열 출력 및 제거
				if (q.isEmpty()) { // 큐가 비어있는 경우
					sb.append("-1\n");
				} else {
					sb.append(q.poll() + "\n");
				}
				break;
				
			case "size": // 큐의 사이즈 출력
				sb.append(q.size() + "\n");
				break;
				
			case "empty":
				if (q.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
				
			case "front": // 큐 맨앞에 있는 문자열 출력
				if (q.isEmpty()) { // 큐가 비어있는 경우
					sb.append("-1\n");
				} else {
					sb.append(q.peek() + "\n"); // 맨앞의 정수 출력 -> 제거x
				}
				break;
				
			default: // 큐 맨뒤에 있는 문자열 출력
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else { 
					sb.append(last + "\n"); // 가장 최근 큐에 들어간 문자열을 저장한 last 출력
				}
			}
		}

		System.out.println(sb.toString());
	}
}
