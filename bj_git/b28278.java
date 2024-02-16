package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b28278 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> s = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			switch (Integer.parseInt(st.nextToken())) {
			case 1:
				s.push(Integer.parseInt(st.nextToken()));
				break;

			case 2:
				if(s.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(s.pop()+"\n");
				}
				break;

			case 3:
				sb.append(s.size() + "\n");
				break;

			case 4:
				if (s.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}

				break;

			default:
				if(s.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(s.peek()+"\n");
				}
			}
		}
		
		System.out.println(sb);

	}
}
