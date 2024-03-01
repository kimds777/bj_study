package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 명령 수 입력

		StringTokenizer st;
		Deque<String> dq = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " "); // 문자열을 " "로 분리
			switch (st.nextToken()) {
			case "1":
				dq.addFirst(st.nextToken());
				break;

			case "2":
				dq.add(st.nextToken());
				break;

			case "3":
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.poll() + "\n");
				}
				break;

			case "4":
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.pollLast() + "\n");
				}
				break;

			case "5":
				sb.append(dq.size()+"\n");
				break;

			case "6":
				if (dq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
				
			case "7":
				if (dq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(dq.peek()+"\n");
				}
				break;				
				
			case "8":
				if (dq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(dq.peekLast()+"\n");
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
