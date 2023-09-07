package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] dial = br.readLine().toCharArray();
		br.close();
		
		int minTime = 0;

		for (char d : dial) {
			int num = d - 65;
			if (num < 3) {
				minTime += 3;
			} else if (3 <= num && num < 6) {
				minTime += 4;
			} else if (6 <= num && num < 9) {
				minTime += 5;
			} else if (9 <= num && num < 12) {
				minTime += 6;
			} else if (12 <= num && num < 15) {
				minTime += 7;
			} else if (15 <= num && num < 19) {
				minTime += 8;
			} else if (19 <= num && num < 22) {
				minTime += 9;
			} else if (22 <= num) {
				minTime += 10;
			}
		}

		System.out.println(minTime);
	}
}
