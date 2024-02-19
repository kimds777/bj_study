package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()); // 재현이가 부를 숫자 갯수

		Stack<Integer> ledger = new Stack<>(); // 장부
		int totalSum = 0; // 잘못된 수를 삭제한 장부의 총합
		
		for (int i = 0; i < K; i++) {
			
			int number = Integer.parseInt(br.readLine());
			
			if (number == 0) { // 재현이가 숫자를 잘못 부른 경우 
				totalSum -= ledger.pop(); // 마지막으로 적은 숫자를 불러오고 삭제
			} else { // 0이 아닌 숫자를 부른 경우
				totalSum += number; // 장부의 총합에 더해준다.
				ledger.push(number); // 장부에 숫자를 적는다.
			}
		}
		
		System.out.println(totalSum); // 장부의 총합을 출력한다.
	}
}
