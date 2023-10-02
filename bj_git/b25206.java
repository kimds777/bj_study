package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 다시풀어야함!! 
public class b25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		double avg = 0.000000;
		double totalGrade = 0;

		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);

		for (int i = 0; i < 20; i++) {
			str = br.readLine();
			String[] strArr = str.split(" ");
			String subjectScore = strArr[2];

			if (!subjectScore.equals("P") && !subjectScore.equals("F")) { // 과목등급이 P가 아닌 경우
				double grade = Double.parseDouble(strArr[1]);

				avg += map.get(subjectScore) * grade;
				totalGrade += grade;
			}
		}
		br.close();

		if (avg != 0.000000) {
			avg = avg / totalGrade;
		}

		System.out.printf("%.6f", avg);
	}
}
