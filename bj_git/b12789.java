package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Stream;

public class b12789 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // 학생들의 수 N
		
		// 엉망인 대기열
		int[] students = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Stack<Integer> line = new Stack<>(); // 새로운 줄을 설 수 있는 공간
		String ans = "Nice";
		int numberTicket = 1; // 현재 번호표
		for (int student : students) { 
			
			// 공간이 비어있지 않고 공간에 마지막으로 들어간 학생의 번호표가 현재 번호표와 같은 경우
			while (!line.empty() && line.peek() == numberTicket) {
				line.pop(); // 공간에 마지막으로 들어간 학생의 번호표를 삭제
				numberTicket++; // 다음 순서인 번호표로 교체
			} 
			
			if (numberTicket == student) { // 엉망인 대기열에 있는 학생의 번호표가 현재 번호표와 같은 경우
				numberTicket++; // 다음 순서인 번호표로 교체
			} else { // 공간이 비어있거나 공간에 마지막으로 들어간 학생의 번호표가 현재 번호표와 다르거나 엉망인 대기열에 있는 학생의 번호표가 현재 번호표와 다른 경우
				line.push(student); // 엉망인 대기열에 있는 학생을 공간으로 이동
			}
		}

		while (!line.empty()) { // 공간에 학생이 대기중인 경우
			if(numberTicket++ != line.pop()) { // 공간에 마지막으로 들어간 학생의 번호표와 다음 순서 번호표가 다른 경우
				ans = "Sad"; // 간식을 받을 수 없으로 중간고사를 망치게 된다.
				break; // 반복문 종료
			}
		}

		System.out.println(ans);
	}
}
