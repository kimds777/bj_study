package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = new String[5];

		for (int i = 0; i < 5; i++) {
			strArr[i] = br.readLine();
		}

		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (strArr[j].length() > i) {
					sb.append(strArr[j].charAt(i));
				}
			}
		}

		System.out.println(sb.toString());
	}
}
