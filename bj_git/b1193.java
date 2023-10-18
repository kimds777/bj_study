package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다시짜야함! 오류남!
public class b1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();

		int cnt = 1;
		int[] fn = { 1, 1 };
		int i = 0;
		while (X > cnt) {

			if (fn[0] == 1 || cnt == 1) {
				fn[1]++; 
				cnt++;
				i++;
				
				for (int j = 0; j < i; j++) {
					fn[0]++;
					fn[1]--;
					cnt++;
					if(cnt == X) break;
				}
				
			} else if (fn[1] == 1 && cnt != 1) {
				fn[0]++;
				cnt++;
				i++;
				
				for (int j = 0; j < i; j++) {
					fn[0]--;
					fn[1]++;
					cnt++;
					if(cnt == X) break;
				}
			}


		}
		
		System.out.println(fn[0]+"/"+fn[1]);
	}
}
