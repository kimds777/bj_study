package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] abcdef = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		
		int x = 0, y = 0;

		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (abcdef[0] * i + abcdef[1] * j == abcdef[2]) {
					if (abcdef[3] * i + abcdef[4] * j == abcdef[5]) {
						x = i;
						y = j;
						break;
					}
				}
			}
		}

		System.out.println(x + " " + y);
	}
}
