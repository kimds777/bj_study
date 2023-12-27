package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class b1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Set<String> string = new HashSet<>(); //HashSet을 사용하여 중복된 단어는 하나만 남기고 제거한다.

		for (int i = 0; i < N; i++) {
			string.add(br.readLine()); 
		}
		
		 List<String> stringSort = new ArrayList<>(string); //Collections.sort를 사용할 수 있게 List로 변환

		Collections.sort(stringSort, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				if (s1.length() == s2.length()) { // 단어의 길이가 같은 경우					
					for (int s = 0; s < s1.length(); s++) {
						char char1 = s1.charAt(s); //s1의 s번째 char
						char char2 = s2.charAt(s); //s2의 s번째 char
						
						if (char1 != char2) { // char1과 char2이 다른 경우
							return char1 - char2; // char1과 char2 비교
						}
					}
					
					return 0;
					
				} else { // 단어의 길이가 다른 경우
					return s1.length() - s2.length(); // s1과 s2의 길이 비교
				}
			}

		});

		StringBuilder sb = new StringBuilder();
		for (String str : stringSort) {
			sb.append(str + "\n");
		}

		System.out.println(sb.toString());
	}
}
