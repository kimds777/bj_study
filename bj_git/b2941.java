package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		int cnt = 0;
		int len = str.length();

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (i < len - 1) {
				char c = str.charAt(i + 1);
				if (ch == 'c') {
					if (c == '=' || c == '-') {
						i++;
					}
				} else if (ch == 'd') {
					if (c == '-') {
						i++;
					} else if (c == 'z' && i < str.length() - 2) {
						if (str.charAt(i + 2) == '=') {
							i += 2;
						}
					}
				} else if (ch == 'l' || ch == 'n') {
					if (c == 'j') {
						i++;
					}
				} else if (ch == 's' || ch == 'z') {
					if (c == '=') {
						i++;
					}
				}
			}
			cnt++;
		}
		
//		replace를 사용한 풀이!
//		cnt = (str.replace("c=", "0").replace("c-", "0").replace("dz=", "0").replace("d-", "0")
//				.replace("lj", "0").replace("nj", "0").replace("s=", "0").replace("z=", "0")).length();

		System.out.println(cnt);
	}
}