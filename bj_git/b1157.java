package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();
		br.close();

		int[] cnt = new int[26];

		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 65]++;
		}

		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				ch = (char) (i + 65);
			} else if (cnt[i] == max) {
				ch = '?';
			}
		}

		System.out.println(ch);
	}
}
