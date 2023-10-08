package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int[][] paper = new int[100][100];

		for (int i = 0; i < tc; i++) {
			int[] colorPaper = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = colorPaper[0]; j < colorPaper[0] + 10; j++) {
				for (int k = colorPaper[1]; k < colorPaper[1] + 10; k++) {
					if (paper[j][k] == 0) {
						paper[j][k] = 1;
					}
				}
			}
		}
		br.close();
		
		int cnt = 0;		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(paper[i][j] == 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}
}
