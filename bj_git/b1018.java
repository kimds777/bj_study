package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class b1018 { //코드 작성중...!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		String str = br.readLine();

		char[][] chessBoard = new char[NM[0]][NM[1]];
		int c = 0;
		while (!str.equals(null)) {
			chessBoard[c] = str.toCharArray();
			c++;
		}

		List<Integer> checkColor = new ArrayList<>();

		for (int i = 0; i < NM[0] - 7; i++) {
			for (int j = 0; j < NM[1] - 7; j++) {
				for (int k = j; k < j + 7; k++) {

				}
			}
		}
	}
}
