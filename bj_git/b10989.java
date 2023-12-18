package bj_git;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 줄의 개수를 받아온다.

		int[] ascSort = new int[10001]; // 10,000보다 작거나 같은 자연수 이므로 1~10,000까지 범위를 잡는다.

		for (int i = 0; i < N; i++) { 
			int number = Integer.parseInt(br.readLine()); 
			ascSort[number]++; // 숫자의 해당되는 인덱스에 값을 1씩 추가한다.
		}
		
		br.close();
		
		// BufferedReader + StringBuilder +Counting Sort 풀이! -> 1792ms
		/*
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10001; i++) {
			while (ascSort[i] != 0) {
				sb.append(i + "\n");
				ascSort[i]--;
			}
		}
		
		System.out.println(sb.toString());
		 */
		
		// BufferedReader + BufferedWriter +Counting Sort 풀이! -> 1380ms
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 10001; i++) {
			int checkNumber = ascSort[i]; 
			if (checkNumber != 0) { // 해당 인덱스의 값이 0이 아닌 경우
				bw.write((i+"\n").repeat(checkNumber)); // BufferedWriter에 인덱스를 인덱스의 값만큼 반복해서 넣어준다.
			}
		}
		
		bw.flush();
		bw.close();
	}
}
