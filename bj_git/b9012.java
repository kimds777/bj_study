package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수

		Stack<Character> stack = new Stack<>(); // VPS인지 판단하기 위한 stack
		StringBuilder sb = new StringBuilder(); // 문자열별로 결과를 저장할 StringBuilder
		for (int i = 0; i < T; i++) {
			
			for (char c : br.readLine().toCharArray()) { // 문자열을 문자배열로 변환하여 for문으로 활용
				
				// stack이 비어있지 않고, stack에 가장 마지막에 들어간 문자가 '('이고, 현재 문자가 ')'인 경우
				if (!stack.isEmpty() && stack.peek()=='(' && c == ')') { 
					stack.pop(); // 가장 마지막에 들어온 문자를 제거한다.
				} else { // stack이 비어있거나 stack에 가장 마지막에 들어온 문자가 '('가 아니거나 현재 문자가 ')'가 아닌 경우
					stack.push(c); // stack에 문자를 저장한다.
				}
			}
			
			if(stack.isEmpty()) { // stack이 비어있는 경우 VPS 이므로
				sb.append("YES\n"); // YES를 저장
			}else { // stack이 비어있지 않는 경우 VPS가 아니므로
				sb.append("NO\n"); // NO를 저장
				stack.removeAllElements(); // stack을 비운다.
			}
		}
		
		System.out.println(sb.toString()); // 테스트 결과를 출력한다.
	}
}
