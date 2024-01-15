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

public interface b7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 로그에 기록된 출입 기록의 수

		Set<String> record = new HashSet<>();
		while (n-- > 0) {
			String[] log = br.readLine().split(" ");
			if (record.contains(log[0])) { // 출근 기록이 있는 직원인 경우
				record.remove(log[0]); // 퇴근 처리 
			} else { // 출근 기록이 없는 직원인 경우
				record.add(log[0]); // 출근 처리
			}
		}
		
		List<String> onDuty = new ArrayList<>(record); // Set은 정렬이 안되기 때문에 List로 변환
		Collections.sort(onDuty,Comparator.reverseOrder()); // 이름순 역정렬 
		
		StringBuilder sb = new StringBuilder();
		for(String o : onDuty) {
			sb.append(o+"\n");
		}
		
		System.out.println(sb);
	}
}
