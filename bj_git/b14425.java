package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class b14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Set<String> S = new HashSet<>();
		for (int i = 0; i < NM[0]; i++) { // S집합에 들어갈 문자열 N개를 담는다.
			S.add(br.readLine());
		}

		int answer = 0;
		for (int j = 0; j < NM[1]; j++) {
			if (S.contains(br.readLine())) { // S집합에 M의 문자열이 들어가있는지 확인
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
