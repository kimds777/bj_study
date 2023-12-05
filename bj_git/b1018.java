package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class b1018 { //보완필요!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		char[][] chessBoard = new char[NM[0]][NM[1]];

		int c = 0;
		while (c < NM[0]) {
			chessBoard[c] = br.readLine().toCharArray();
			c++;
		}

		List<Integer> checkColor = new ArrayList<>();

		for (int i = 0; i < NM[0] - 8; i++) { // 행
			int cnt = 0;
			for (int j = 0; j < NM[1] - 8; j++) { // 열
				char preColor = 0;
				for (int k = i; k < i + 8; k++) { // 행 8개 확인

					char firstColor = chessBoard[k][j];

					if (firstColor != preColor) {
						cnt++;
						if(preColor == 'W') {
							firstColor = 'W';
						}else {
							firstColor = 'B';
						}
					}
					
					System.out.print(firstColor+" ");

					if (firstColor == 'W') {
						preColor = 'B';
					} else {
						preColor = 'W';
					}
					for (int l = j + 1; l < j + 8; l++) { // 열 8개 확인
						System.out.print(preColor+" ");

						if (preColor != chessBoard[k][l]) {
							cnt++;
						}

						if (l < j + 7) {
							if (preColor == 'W') {
								preColor = 'B';
							} else {
								preColor = 'W';
							}
						}

					}

					if (firstColor == 'W') {
						preColor = 'B';
					} else {
						preColor = 'W';
					}

					System.out.println();

				}
				System.out.println("================");
				checkColor.add(cnt);
			}
		}

		Collections.sort(checkColor);
		System.out.println(checkColor.size());
		for (int cc : checkColor) {
			System.out.print(cc + " ");
		}
	}
}
