package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[][] user = new String[N][2];

		for (int i = 0; i < N; i++) {
			user[i] = br.readLine().split(" "); // split하여 String[]로 변환
		}

		Arrays.sort(user, new Comparator<String[]>() {

			@Override
			public int compare(String[] u1, String[] u2) {
				int age1 = Integer.parseInt(u1[0]); // 0번째 index String int로 변환하여 age1에 대입
                int age2 = Integer.parseInt(u2[0]); // 0번째 index String int로 변환하여 age2에 대입
                
				if (age1 == age2) { // 나이 같은 경우 
					return 0; // 입력순서대로 냅둔다.
				} else { // 나이가 다른 경우
					return age1 - age2; // 비교 진행
				}
			}

		});

		StringBuilder sb = new StringBuilder();
		for (String[] u : user) {
			sb.append(u[0]+" "+u[1]+"\n");
		}

		System.out.println(sb.toString());
	}
}
