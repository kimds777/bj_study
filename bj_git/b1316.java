package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			boolean[] bl = new boolean[26];
			boolean b = true;
			String str = br.readLine();

			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j)-'a';
				if(bl[index]) {
					if(str.charAt(j) != str.charAt(j-1)) {
						b = false;
						break;
					}					
				}else {
					bl[index] = true;
				}
			}
			
			if(b) {
				cnt++;
			}
			
		}
		br.close();
		
		System.out.println(cnt);
	}

}
