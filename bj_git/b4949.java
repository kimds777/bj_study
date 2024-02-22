package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 문자열이 균형인지 결과를 저장하는 StringBuilder
		
		String str; // 입력된 문자열을 받을 String
		while (true) {
			str = br.readLine(); // 문자열 입력
			if (str.equals(".")) { // 입력된 문자열이 "."인 경우 검사중단
				break;
			}
			sb.append(checkString(str)); // 메소드 checkString을 실행하여 결과를 StringBuilder에 저장
		}

		System.out.println(sb.toString()); // 결과 출력
	}

	private static String checkString(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) { // 문자열 s를 문자배열로 변환

			if (c == '[' || c == '(') { // 문자가 '['이거나 '('인 경우
				stack.push(c); // stack에 저장
			} else if (c == ')') { // 문자가 ')'인 경우
				if (stack.empty() || stack.peek() != '(') { // stack이 비어있거나 stack에 마지막 문자가 '('가 아닌 경우 
					stack.push(c); // !stack.empty()를 만족하기 위해 문자를 stack에 넣어준다.
					break; // 균형을 이루는 문자열이 아니기 때문에 반복문 중단
				} else if (stack.peek() == '(') { // stack에 마지막 문자가 '('인 경우
					stack.pop(); // 괄호가 성립되므로 마지막 문자 삭제
				}
			} else if (c == ']') { // 문자가 ']'인 경우
				if (stack.empty() || stack.peek() != '[') { // stack이 비어있거나 stack에 마지막 문자가 '['가 아닌 경우
					stack.push(c); // !stack.empty()를 만족하기 위해 문자를 stack에 넣어준다.
					break; // 균형을 이루는 문자열이 아니기 때문에 반복문 중단
				} else if (stack.peek() == '[') { // stack에 마지막 문자가 '['인 경우
					stack.pop(); // 괄호가 성립되므로 마지막 문자 삭제
				}
			}
		}

		if (stack.empty()) { // stack이 비어있는 경우
			return "yes\n"; // 균형있는 문자열이므로 yes를 return
		}

		return "no\n"; // 기본값으로 no를 retrun
	}
}
