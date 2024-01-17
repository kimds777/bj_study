package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class b1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 듣도 못한 사람의 수 -> N, 보도 못한 사람의 수 -> M

		Set<String> unknown = new HashSet<>(); // 듣도 못한 사람의 명단
		for (int i = 0; i < NM[0]; i++) {
			unknown.add(br.readLine());
		}
		
		List<String> unknownUnsee = new ArrayList<>(); // 듣도 보도 못한 사람의 명단
		for (int j = 0; j < NM[1]; j++) {
			String unsee = br.readLine(); // 보도 못한 사람 이름
			if(unknown.contains(unsee)) { // 듣도 못한 사람의 명단에 보도 못한 사람 이름이 있는 경우
				unknownUnsee.add(unsee); // 듣도 보도 못한 사람의 명단에 이름 추가
			}
		}
		
		Collections.sort(unknownUnsee); // 명단을 사전순으로 정렬
		
		StringBuilder sb = new StringBuilder();
		sb.append(unknownUnsee.size()+"\n"); // 듣도 보도 못한 사람의 수를 sb에 넣어준다.
		for(String u : unknownUnsee) {
			sb.append(u+"\n"); // // 듣도 보도 못한 사람의 이름을 sb에 넣어준다.
		}
		
		System.out.println(sb);
	}
}
