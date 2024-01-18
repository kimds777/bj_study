package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		Set<String> partString = new HashSet<>(); // 중복되지않는 부분 문자열을 넣을 Set
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				partString.add(S.substring(i, j)); // 문자열 S의 i번째부터 j번째 전까지의 문자열을 Set에 저장
			}
		}

		System.out.println(partString.size()); // 중복되지않는 부분 문자열 갯수 출력
	}
}
