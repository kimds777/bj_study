package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine(); // 집합 A와 B의 길이	
		String[] A = br.readLine().split(" "); // 집합 A
		String[] B = br.readLine().split(" "); // 집합 B

		Set<String> difference = new HashSet<>(); // 대칭 차집합
		for (String a : A) {
			difference.add(a); // A의 원소를 차집합에 넣는다.
		}

		for (String b : B) {
			if (!difference.remove(b)) { // 대칭 차집합에 b가 없는 경우 -> 차집합에 b가 있는 경우 삭제하고 true 반환
				difference.add(b); // B의 원소를 대칭 차집합에 넣는다.
			}
		}

		System.out.println(difference.size());
	}
}
