package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class b1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		char[][] chessBoard = new char[NM[0]][NM[1]];

		char[][] startBChessBoard = { 
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, 
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, 
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, 
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

		char[][] startWChessBoard = { 
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, 
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, 
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, 
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' } };

		int c = 0;
		while (c < NM[0]) {
			chessBoard[c] = br.readLine().toCharArray();
			c++;
		}
		br.close();

		List<Integer> checkColor = new ArrayList<>();

		for (int i = 0; i < NM[0] - 7; i++) { // 행
			for (int j = 0; j < NM[1] - 7; j++) { // 열
				int startBCnt = 0;
				int startWCnt = 0;
				for (int k = i; k < i + 8; k++) { // 행 8개 확인
					for (int l = j; l < j + 8; l++) { // 열 8개 확인
						if (chessBoard[k][l] != startBChessBoard[k - i][l - j]) {
							startBCnt++;
						}

						if (chessBoard[k][l] != startWChessBoard[k - i][l - j]) {
							startWCnt++;
						}
					}
				}

				if (startBCnt > startWCnt) {
					checkColor.add(startWCnt);
				} else {
					checkColor.add(startBCnt);
				}
			}
		}

		Collections.sort(checkColor);

		System.out.print(checkColor.get(0));

	}
}
